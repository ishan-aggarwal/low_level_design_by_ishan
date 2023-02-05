package solid.i.v1;

import java.io.File;

public class DropboxProvider implements CloudStorageProvider {

    @Override
    public void uploadFile(String name) {
        System.out.println("Uploading file " + name + " to Dropbox");
    }

    @Override
    public File getFile(String name) {
        return new File(name);
    }
}
