package creational.builder.mealbuilder;

public abstract class ColdDrink implements Item {

    @Override
    public Packing getPacking() {
        return Packing.BOTTLE;
    }
}
