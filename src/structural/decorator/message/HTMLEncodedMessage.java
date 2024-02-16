package structural.decorator.message;

public class HTMLEncodedMessage implements Message {
    private Message message;

    public HTMLEncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        return String.format("<p>%s<p>", message.getContent());
    }
}
