package structural.decorator;

public class Client {
    public static void main(String[] args) {
        final Message secretMessage = new TextMessage("obicham purjoli");
        final HTMLEncodedMessage htmlEncodedMessage = new HTMLEncodedMessage(new Base64EncodedMessage(secretMessage));
        System.out.println(htmlEncodedMessage.getContent());
    }
}
