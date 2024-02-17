package behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        final IterativeFactorial iterativeFactorial = new IterativeFactorial();
        final ScientificCalculator scientificCalculator = new ScientificCalculator(iterativeFactorial);
        scientificCalculator.calculateFactorial(2);
    }
}
