package creational.factorymethod.abstractcreator;

public class SquareFactory implements ShapeFactory {
    private final Shape square;

    public SquareFactory(double side) {
        this.square = new Square(side);
    }

    @Override
    public Shape getShape() {
        return square;
    }
}
