package bridge.dataexport;

public class UserExporter extends IExporter {
    public UserExporter(IFormatter formatter) {
        super(formatter);
    }

    @Override
    public String export() {
        String rawData = "User Data from DB";
        return formatter.format(rawData);
    }
}
