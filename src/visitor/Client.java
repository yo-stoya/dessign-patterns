package visitor;

public class Client {
    public static void main(String[] args) {
        final Cat cat = new Cat();
        final AnimalVisitor animalMakeSoundVisitor = new AnimalMakeSoundVisitor();
        animalMakeSoundVisitor.visit(cat);
    }
}
