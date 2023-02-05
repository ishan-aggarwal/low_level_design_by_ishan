package solid.i.v1;

import java.io.File;

public interface CloudStorageProvider {
    public void uploadFile(String name);

    public File getFile(String name);
}
