package solid.i.v0;

import java.io.File;
import java.util.List;

public class DropboxProvider implements CloudProvider {

    @Override
    public void addServer(String region, String serverId) {
        throw new UnsupportedOperationException("Can not add server to Dropbox");
    }

    @Override
    public List<String> listServers(String region) {
        throw new UnsupportedOperationException("Can not list servers in Dropbox");
    }

    @Override
    public String getCDNAddress() {
        throw new UnsupportedOperationException("Dropbox does not support CDN");
    }

    @Override
    public void uploadFile(String name) {
        System.out.println("Uploading file " + name + " to Dropbox");
    }

    @Override
    public File getFile(String name) {
        return new File(name);
    }
}

// Here we are breaking the ISP principle by forcing the DropboxProvider to implement methods that it does not need.
// So, we should segregate the CloudProvider interface into smaller interfaces that are specific to each provider.
//  - CloudHostingProvider, CloudStorageProvider, CDNProvider
// Then SalesforceProvider can implement only the CloudHostingProvider interface and DropboxProvider can implement only the CloudStorageProvider interface while AWSProvider can implement all three interfaces.