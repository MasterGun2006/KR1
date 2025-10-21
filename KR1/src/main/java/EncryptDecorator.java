import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class EncryptDecorator extends MessageDecorator {
    public EncryptDecorator(Message wrappee) {
        super(wrappee);
    }

    @Override
    public String getText() {
        String src = wrappee.getText();
        return Base64.getEncoder().encodeToString(src.getBytes(StandardCharsets.UTF_8));
    }
}
