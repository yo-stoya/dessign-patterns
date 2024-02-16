package creational.factorymethod.concretecreator;

public class ShapeFactory {

    public Shape getShape(ShapeType type) {
        return switch (type) {
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
        };
    }
}
