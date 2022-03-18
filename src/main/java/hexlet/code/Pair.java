package hexlet.code;

public final class Pair {
    private final String question;
    private final String answer;

    public Pair(String questionData, String answerData) {
        this.question = questionData;
        this.answer = answerData;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
