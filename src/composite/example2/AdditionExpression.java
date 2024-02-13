package composite.example2;

public class AdditionExpression implements Expression {
    private final Expression leftSide;
    private final Expression rightSide;

    public AdditionExpression(Expression leftSide, Expression rightSide) {
        this.leftSide = leftSide;
        this.rightSide = rightSide;
    }

    @Override
    public double getResult() {
        return leftSide.getResult() + rightSide.getResult();
    }
}
