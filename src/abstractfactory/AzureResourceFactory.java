package abstractfactory;

public class AzureResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance() {
        return new AzureVM();
    }

    @Override
    public Storage createStorage() {
        return new AzureUltraDisk();
    }
}
