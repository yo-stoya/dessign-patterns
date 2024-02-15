package abstractfactory;

public interface ResourceFactory {
    Instance createInstance();
    Storage createStorage();
}
