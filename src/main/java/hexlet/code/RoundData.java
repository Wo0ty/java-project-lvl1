package hexlet.code;

public final class RoundData {
    private final String question;
    private final String answer;

    public RoundData(String questionData, String answerData) {
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
