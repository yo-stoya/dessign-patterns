package builder.mealbuilder;

public class VeggieMeal implements MealBuilder {
    private final Meal meal = new Meal();

    @Override
    public void buildBurger() {
        final VeggieBurger veggieBurger = new VeggieBurger();
        meal.addItem(veggieBurger);
    }

    @Override
    public void buildDrink() {
        final Coke coke = new Coke();
        meal.addItem(coke);
    }

    @Override
    public Meal getMeal() {
        return meal;
    }
}
