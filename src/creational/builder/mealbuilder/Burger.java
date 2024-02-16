package creational.builder.mealbuilder;

public abstract class Burger implements Item {

    @Override
    public Packing getPacking() {
        return Packing.WRAPPER;
    }
}
