package creational.builder.mealbuilder;

public class Director {
    private final MealBuilder mealBuilder;

    public Director(MealBuilder mealBuilder) {
        this.mealBuilder = mealBuilder;
    }

    public Meal constructMeal() {
        mealBuilder.buildBurger();
        mealBuilder.buildDrink();
        return mealBuilder.getMeal();
    }
}
