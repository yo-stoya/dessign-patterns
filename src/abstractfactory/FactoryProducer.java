package abstractfactory;

public final class FactoryProducer {

    private FactoryProducer() {
    }

    public static ResourceFactory getFactory(CloudProvider provider) {
        return switch (provider) {
            case AZURE -> new AzureResourceFactory();
            case AWS -> new AwsResourceFactory();
        };
    }
}
