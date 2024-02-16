package structural.bridge;

public abstract class Color {
    private int red;
    private int green;
    private int blue;

    protected Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void fillBorder() {
        System.out.println("filling with "+ red + green + blue);
    }
}
