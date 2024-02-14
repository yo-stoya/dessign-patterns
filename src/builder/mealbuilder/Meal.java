package builder.mealbuilder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private final List<Item> items;

    public Meal() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }


    public double getCost() {
        return items.stream().mapToDouble(Item::getPrice).sum();
    }

    public void showItems() {
        items.forEach(item -> {
            System.out.printf("""
                            Item: %s
                            Packing: %s
                            Price: %.2f
                            %n""", item.getName(), item.getPacking().toString(),
                    item.getPrice());
        });
    }
}
