package composite.example2;

public class Client {
    public static void main(String[] args) {
        final Constant left = new Constant(10);
        final Constant right = new Constant(2);
        final AdditionExpression additionResult = new AdditionExpression(left, right);
        System.out.println(additionResult.getResult());
    }
}
