package bridge.dataexport;

public class XmlFormatter implements IFormatter {
    @Override
    public String format(String rawData) {
        return "<data>" + rawData + "</data>";
    }
}
