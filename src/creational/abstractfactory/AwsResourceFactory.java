package creational.abstractfactory;

public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance() {
        return new Ec2Instance();
    }

    @Override
    public Storage createStorage() {
        return new S3Storage();
    }
}
