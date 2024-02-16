package structural.decorator.shape;

public class Client {
    public static void main(String[] args) {
        final Rectangle rectangle = new Rectangle();
        final Shape dashedBorderDecorator = new DashedBorderDecorator(rectangle);
        dashedBorderDecorator.draw();
    }
}
