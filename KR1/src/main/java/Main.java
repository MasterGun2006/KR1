public class Main {
    public static void main(String[] args) {
        Message base = new TextMessage("Перевірка коду");

        System.out.println("База:           " + base.getText());

        Message compressed = new CompressDecorator(base);
        System.out.println("Після стиснення: " + compressed.getText());

        Message encrypted = new EncryptDecorator(compressed);
        System.out.println("Після шифрування: " + encrypted.getText());

        Message withTime = new TimestampDecorator(encrypted);
        System.out.println("Після дати/часу: " + withTime.getText());

        Message withAuthor = new AuthorDecorator(withTime);
        System.out.println("Після автора:    " + withAuthor.getText());

        Message chain2 = new AuthorDecorator(
                new TimestampDecorator(
                        new EncryptDecorator(base)));
        System.out.println("\nАльтернативний порядок: " + chain2.getText());
    }
}