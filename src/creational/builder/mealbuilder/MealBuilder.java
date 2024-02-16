package creational.builder.mealbuilder;

public interface MealBuilder {
    void buildBurger();
    void buildDrink();
    Meal getMeal();
}
