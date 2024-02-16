package structural.decorator.message;

public class TextMessage implements Message {
    private String content;

    public TextMessage(String content) {
        this.content = content;
    }

    @Override
    public String getContent() {
        return content;
    }
}
