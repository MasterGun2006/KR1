public class TextMessage implements Message {
    private final String text;

    public TextMessage(String text) {
        this.text = text;
    }

    @Override
    public String getText() {
        return text;
    }
}