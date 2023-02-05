package solid.i.v1;

import java.util.List;

public interface CloudHostingProvider {
    public void addServer(String region, String serverId);
    public List<String> listServers(String region);
}
