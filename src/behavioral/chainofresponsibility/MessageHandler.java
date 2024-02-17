package behavioral.chainofresponsibility;

public abstract class MessageHandler implements MessageReceiver {
    private final MessageReceiver nextReceiver;

    public MessageHandler(MessageReceiver nextReceiver) {
        this.nextReceiver = nextReceiver;
    }

    @Override
    public void processMessage(Message message) {
        if (!canProcessMessage(message) && nextReceiver != null) {
            nextReceiver.processMessage(message);
        }
    }

    protected abstract boolean canProcessMessage(Message message);
}
