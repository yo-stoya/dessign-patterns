package creational.factorymethod.concretecreator;

public class Client {
    public static void main(String[] args) {
        final ShapeFactory shapeFactory = new ShapeFactory();
        final Shape rectangle = shapeFactory.getShape(ShapeType.RECTANGLE);
        rectangle.draw();

        final Shape square = shapeFactory.getShape(ShapeType.SQUARE);
        square.draw();
    }
}
