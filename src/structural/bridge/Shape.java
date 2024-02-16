package structural.bridge;

public abstract class Shape {
    private double x;
    private double y;
    private double z;
    private Color color;

    public Shape(double x, double y, double z, Color color) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
    }

    public void draw() {
        System.out.println("drawing a " + this.getClass().getSimpleName());
    }

    public void addBorder() {
        color.fillBorder();
    }
}
