package behavioral.chainofresponsibility;

public class Message {
    public enum Priority {
        HIGH,
        NORMAL
    }

    public enum Type {
        EMAIL,
        FAX
    }
    private String content;
    private Priority priority;
    private Type type;

    public Message(String content, Priority priority, Type type) {
        this.content = content;
        this.priority = priority;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public Priority getPriority() {
        return priority;
    }

    public Type getType() {
        return type;
    }
}


