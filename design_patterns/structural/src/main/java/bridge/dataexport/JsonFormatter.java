package bridge.dataexport;

public class JsonFormatter implements IFormatter {
    @Override
    public String format(String rawData) {
        return "JSON: {\"data\": \"" + rawData + "\"}";
    }
}