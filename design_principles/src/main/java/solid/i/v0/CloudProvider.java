package solid.i.v0;

import java.io.File;
import java.util.List;

public interface CloudProvider {

    public void addServer(String region, String serverId);

    public List<String> listServers(String region);

    public String getCDNAddress();

    public void uploadFile(String name);

    public File getFile(String name);
}
