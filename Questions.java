import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Questions {
   private Scanner scanner;
   private ArrayList<QBuilder> qBuilders;
   ArrayList<QBuilder> incorrectFirstTry = new ArrayList<>();
   public Questions(Scanner scanner, ArrayList<QBuilder> qBuilders) {
       this.scanner = scanner;
       this.qBuilders = qBuilders;
   }


   private String getNextStringLineFromUser() {
       return scanner.nextLine();
   }
   void question1() {
       Collections.shuffle(qBuilders);
       int questionNumber = 0;
       for (QBuilder qBuilder : qBuilders) {
           questionNumber += 1;
           printQuestion(qBuilder, questionNumber);
           String userResponse = getNextStringLineFromUser();
           while (!userResponse.equalsIgnoreCase(qBuilder.getCorrectAnswer())) {
               if (validateAnswer(userResponse)) {
                   System.out.println("That answer is invalid, please try again");
                   userResponse = getNextStringLineFromUser();
               } else {
                   System.out.println("Incorrect, please try again.");
                   if (!incorrectFirstTry.contains(qBuilder)) {
                       incorrectFirstTry.add(qBuilder);
                   }
                   userResponse = getNextStringLineFromUser();
               }
           }
           if (userResponse.equalsIgnoreCase(qBuilder.getCorrectAnswer())) {
               System.out.println("Correct!");
               System.out.println();
           }
       }
   }
   void incorrect() {
       Collections.shuffle(incorrectFirstTry);
       int questionNumber = 0;
       for (QBuilder qBuilder : incorrectFirstTry) {
           questionNumber += 1;
           printQuestion(qBuilder, questionNumber);
           String userResponse = getNextStringLineFromUser();
           while (!userResponse.equalsIgnoreCase(qBuilder.getCorrectAnswer())) {
               if (validateAnswer(userResponse)) {
                   System.out.println("That answer is invalid, please try again");
                   userResponse = getNextStringLineFromUser();
               } else {
                   System.out.println("Incorrect, please try again.");
                   if (!incorrectFirstTry.contains(qBuilder)) {
                       incorrectFirstTry.add(qBuilder);
                   }
                   userResponse = getNextStringLineFromUser();
               }
           }
           if (userResponse.equalsIgnoreCase(qBuilder.getCorrectAnswer())) {
               System.out.println("Correct!");
               System.out.println();
           }
       }
   }
   public void incorrectListOption() {
       if (incorrectFirstTry.size() == 0) {
           System.out.println("Congratulations on getting a perfect score! Run program again to get the questions in a different order.");
       } else {
           System.out.println("Would you like to go through the questions you got wrong on the first try? Please enter yes or no.");
           String userResponse = getNextStringLineFromUser();
           if (userResponse.equalsIgnoreCase("yes")) {
               incorrect();
               System.out.println(String.format("Congratulations on completing the practice test!%nRun program again to get the questions in a different order.%nGoodbye."));
           } else {
               System.out.println(String.format("Congratulations on completing the practice test!%nRun program again to get the questions in a different order.%nGoodbye."));
           }
       }
   }


   public boolean validateAnswer(String userResponse) {
       if (!userResponse.equalsIgnoreCase("a") && !userResponse.equalsIgnoreCase("b") && !userResponse.equalsIgnoreCase("c") && !userResponse.equalsIgnoreCase("d")) {
           return true;
       } else {
           return false;
       }
   }
   public void printQuestion(QBuilder qBuilder, int questionNumber) {
       String question =
               String.format("%d. %s%nA. %s%nB. %s%nC. %s%nD. %s",
                       questionNumber,
                       qBuilder.getTestQuestion(),
                       qBuilder.getAnswerA(),
                       qBuilder.getAnswerB(),
                       qBuilder.getAnswerC(),
                       qBuilder.getAnswerD()
               );
       System.out.println(question);
   }


}
