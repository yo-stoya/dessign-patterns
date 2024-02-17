package behavioral.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        final Message newMessage = new Message("make pancakes", Message.Priority.HIGH, Message.Type.EMAIL);
        final MessageReceiver faxMessageHandler = new FaxMessageHandler(new EmailMessageHandler(null));
        faxMessageHandler.processMessage(newMessage);
    }
}
