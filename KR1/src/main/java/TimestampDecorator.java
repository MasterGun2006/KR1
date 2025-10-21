import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TimestampDecorator extends MessageDecorator {
    private final DateTimeFormatter fmt =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public TimestampDecorator(Message wrappee) {
        super(wrappee);
    }

    @Override
    public String getText() {
        String now = LocalDateTime.now().format(fmt);
        return "[" + now + "] " + wrappee.getText();
    }
}