package creational.abstractfactory;

import java.util.UUID;

public class AzureUltraDisk implements Storage {
    @Override
    public String getId() {
        return UUID.fromString("my random string").toString();
    }

    @Override
    public long getSize() {
        return 100000L;
    }
}
