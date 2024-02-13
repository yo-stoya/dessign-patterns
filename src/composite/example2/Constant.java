package composite.example2;

public class Constant implements Expression {
    private final double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double getResult() {
        return value;
    }
}
