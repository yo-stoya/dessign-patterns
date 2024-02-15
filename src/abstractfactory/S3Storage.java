package abstractfactory;

import java.util.UUID;

public class S3Storage implements Storage {
    @Override
    public String getId() {
        return UUID.randomUUID().toString();
    }

    @Override
    public long getSize() {
        return 100000L;
    }
}
