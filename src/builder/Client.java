package builder;

public class Client {
    public static void main(String[] args) {
        VeggieMeal mealBuilder = new VeggieMeal();
        Director director = new Director(mealBuilder);
        Meal meal = director.constructMeal();

    }
}
