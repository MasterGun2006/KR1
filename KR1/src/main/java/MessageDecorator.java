public abstract class MessageDecorator implements Message {
    protected final Message wrappee;

    protected MessageDecorator(Message wrappee) {
        this.wrappee = wrappee;
    }
}