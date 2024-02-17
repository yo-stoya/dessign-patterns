package creational.factorymethod.concretecreator;

public class Client {
    public static void main(String[] args) {
        final Shape rectangle = ShapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.draw();

        final Shape square = ShapeFactory.getShape(ShapeType.SQUARE);
        square.draw();
    }
}
