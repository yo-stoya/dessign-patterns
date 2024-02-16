package structural.decorator.shape;

public abstract class BorderDecorator implements Shape {
    private Shape shape;

    public BorderDecorator(Shape shape) {
        this.shape = shape;
    }

    protected abstract void drawBorder();


    @Override
    public void draw() {
        shape.draw();
        drawBorder();
    }
}
