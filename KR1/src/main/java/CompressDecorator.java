public class CompressDecorator extends MessageDecorator {
    public CompressDecorator(Message wrappee) {
        super(wrappee);
    }

    @Override
    public String getText() {
        String t = wrappee.getText();
        return t.replaceAll("\\s+", " ").trim();
    }
}