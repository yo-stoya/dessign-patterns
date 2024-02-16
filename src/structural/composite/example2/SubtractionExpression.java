package structural.composite.example2;

public class SubtractionExpression implements Expression {
    private final Expression leftSide;
    private final Expression rightSide;

    public SubtractionExpression(Expression leftSide, Expression rightSide) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    @Override
    public double getResult() {
        return leftSide.getResult() - rightSide.getResult();
    }
}
