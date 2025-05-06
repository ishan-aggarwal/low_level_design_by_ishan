package bridge.dataexport;

public class ProductExporter extends IExporter {
    public ProductExporter(IFormatter formatter) {
        super(formatter);
    }

    @Override
    public String export() {
        String rawData = "Product Data from DB";
        return formatter.format(rawData);
    }
}
