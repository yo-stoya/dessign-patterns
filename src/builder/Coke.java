package builder;

public class Coke extends ColdDrink {
    @Override
    public String getName() {
        return "Coca-Cola";
    }

    @Override
    public double getPrice() {
        return 2.50;
    }
}
