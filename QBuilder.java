public class QBuilder {
    private String testQuestion;
    private String correctAnswer;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
 
 
    public QBuilder(String testQuestion, String correctAnswer, String answerA, String answerB, String answerC, String answerD) {
        this.testQuestion = testQuestion;
        this.correctAnswer = correctAnswer;
        this.answerA = answerA;
        this.answerB = answerB;
        this.answerC = answerC;
        this.answerD = answerD;
    }
 
 
    public String getTestQuestion() {
        return testQuestion;
    }
    public String getCorrectAnswer() {
        return correctAnswer;
    }
    public String getAnswerA() {
        return answerA;
    }
    public String getAnswerB() {
        return answerB;
    }
    public String getAnswerC() {
        return answerC;
    }
    public String getAnswerD() {
        return answerD;
    }
 }
 
 