package structural.decorator;

import java.util.Base64;

public class Base64EncodedMessage implements Message {
    private Message message;

    public Base64EncodedMessage(Message message) {
        this.message = message;
    }

    @Override
    public String getContent() {
        final String content = message.getContent();
        return Base64.getEncoder().encodeToString(content.getBytes());
    }
}
