package behavioral.chainofresponsibility;

public class EmailMessageHandler extends MessageHandler {
    public EmailMessageHandler(MessageReceiver nextReceiver) {
        super(nextReceiver);
    }

    @Override
    protected boolean canProcessMessage(Message message) {
        final boolean isEmailMessage = message.getType() == Message.Type.EMAIL;
        if (isEmailMessage) {
            System.out.println("Email handler processing msg: " + message.getContent());
        }

        return isEmailMessage;
    }
}
