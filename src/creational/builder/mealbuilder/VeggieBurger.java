package creational.builder.mealbuilder;

public class VeggieBurger extends Burger {
    @Override
    public String getName() {
        return "Super Veggie Burger";
    }

    @Override
    public double getPrice() {
        return 10.50;
    }
}
