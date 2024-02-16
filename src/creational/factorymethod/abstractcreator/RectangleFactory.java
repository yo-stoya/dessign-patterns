package creational.factorymethod.abstractcreator;

public class RectangleFactory implements ShapeFactory {
    private final Shape rectangle;

    public RectangleFactory(double width, double length) {
        this.rectangle = new Rectangle(width, length);
    }

    @Override
    public Shape getShape() {
        return rectangle;
    }
}
