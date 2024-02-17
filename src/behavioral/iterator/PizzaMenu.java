package behavioral.iterator;

public enum PizzaMenu {
    MARGHERITA,
    PEPPERONI,
    NAPOLETANA,
    CASA_BLANCA;

    public static Iter<PizzaMenu> getIterator() {
        return new PizzaMenuIterator();
    }
    private static class PizzaMenuIterator implements Iter<PizzaMenu> {
        private int position;

        @Override
        public boolean hasNext() {
            return position < PizzaMenu.values().length;
        }

        @Override
        public PizzaMenu next() {
            if (hasNext()) {
                return PizzaMenu.values()[position++];
            }

            return null; // or throw RuntimeExcp
        }
    }
}


