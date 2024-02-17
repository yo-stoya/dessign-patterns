package behavioral.chainofresponsibility;

public class FaxMessageHandler extends MessageHandler {
    public FaxMessageHandler(MessageReceiver nextReceiver) {
        super(nextReceiver);
    }

    @Override
    protected boolean canProcessMessage(Message message) {
        final boolean isFaxMessage = message.getType() == Message.Type.FAX;
        if (isFaxMessage) {
            System.out.println("Fax handler processing: " + message.getContent());
        }

        return isFaxMessage;
    }
}
