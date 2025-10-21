public class AuthorDecorator extends MessageDecorator {
    private final String author;

    public AuthorDecorator(Message wrappee) {
        super(wrappee);
        this.author = "Троценко Максим ІО-41";
    }

    public AuthorDecorator(Message wrappee, String author) {
        super(wrappee);
        this.author = author;
    }

    @Override
    public String getText() {
        return wrappee.getText() + " — Автор: " + author;
    }
}