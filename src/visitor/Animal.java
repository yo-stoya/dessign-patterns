package visitor;

public interface Animal {
    void accept(AnimalVisitor visitor);
}
