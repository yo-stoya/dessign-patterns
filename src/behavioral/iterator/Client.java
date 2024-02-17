package behavioral.iterator;

public class Client {
    public static void main(String[] args) {
        final Iter<PizzaMenu> iterator = PizzaMenu.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
