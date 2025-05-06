package bridge.dataexport;

public class CompanyExporter extends IExporter {
    public CompanyExporter(IFormatter formatter) {
        super(formatter);
    }

    @Override
    public String export() {
        String rawData = "Company Data from DB";
        return formatter.format(rawData);
    }
}
