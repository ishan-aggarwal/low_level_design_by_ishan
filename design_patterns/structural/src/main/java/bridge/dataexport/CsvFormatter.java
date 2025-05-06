package bridge.dataexport;

public class CsvFormatter implements IFormatter {
    @Override
    public String format(String rawData) {
        return "CSV: " + rawData;
    }
}


