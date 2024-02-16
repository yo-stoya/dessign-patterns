package structural.decorator.shape;

public class DashedBorderDecorator extends BorderDecorator {
    public DashedBorderDecorator(Shape shape) {
        super(shape);
    }

    @Override
    protected void drawBorder() {
        System.out.println("Drawing dashed border");
    }


}
