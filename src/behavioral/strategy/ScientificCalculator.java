package behavioral.strategy;

import java.math.BigInteger;

public class ScientificCalculator {
    private Factorial factorial;

    public ScientificCalculator(Factorial factorial) {
        this.factorial = factorial;
    }

    public BigInteger calculateFactorial(int n) {
        return factorial.calculate(n);
    }
}
