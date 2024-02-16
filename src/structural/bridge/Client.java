package structural.bridge;

public class Client {
    public static void main(String[] args) {
        final RedColor redColor = new RedColor(1, 1, 1);
        final Shape shape = new Rectangle(1, 1, 1, redColor);
        shape.addBorder();
        shape.draw();
    }
}
