package creational.factorymethod.abstractcreator;

public class Client {
    public static void main(String[] args) {
        final ShapeFactory rectangleFactory = new RectangleFactory(10, 10);
        final Shape rectangle = rectangleFactory.getShape();
        System.out.println("Rectangle area: " + rectangle.getArea());

        final SquareFactory squareFactory = new SquareFactory(10);
        final Shape square = squareFactory.getShape();
        System.out.println("Square area: " + square.getArea());

    }
}
