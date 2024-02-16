package creational.abstractfactory;

public class Client {
    public static void main(String[] args) {
        final ResourceFactory resourceFactory = FactoryProducer.getFactory(CloudProvider.AWS);
        final Instance instance = resourceFactory.createInstance();
        final Storage storage = resourceFactory.createStorage();

        instance.attachStorage(storage);
        instance.start();
        instance.stop();
    }
}
