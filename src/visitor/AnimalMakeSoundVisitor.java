package visitor;

public class AnimalMakeSoundVisitor implements AnimalVisitor {
    @Override
    public void visit(Dog dog) {
        System.out.println("bark-bark");
    }

    @Override
    public void visit(Cat dog) {
        System.out.println("meow-meow");
    }
}
