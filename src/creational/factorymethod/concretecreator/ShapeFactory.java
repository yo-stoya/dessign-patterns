package creational.factorymethod.concretecreator;

public interface ShapeFactory {

    static Shape getShape(ShapeType type) {
        return switch (type) {
            case SQUARE -> new Square();
            case RECTANGLE -> new Rectangle();
        };
    }
}
