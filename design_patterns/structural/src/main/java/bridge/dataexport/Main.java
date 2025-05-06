package bridge.dataexport;

// https://medium.com/@iamprovidence/bridge-pattern-without-bullsh-t-38d7d851ed4d

public class Main {
    public static void main(String[] args) {
        IExporter userExporterCsv = new UserExporter(new CsvFormatter());
        IExporter companyExporterJson = new CompanyExporter(new JsonFormatter());
        IExporter productExporterXml = new ProductExporter(new XmlFormatter());

        System.out.println(userExporterCsv.export());      // Outputs CSV formatted data
        System.out.println(companyExporterJson.export());  // Outputs JSON formatted data
        System.out.println(productExporterXml.export());   // Outputs XML formatted data
    }
}

/**
 * CSV: User Data from DB
 * JSON: {"data": "Company Data from DB"}
 * <data>Product Data from DB</data>
 */

/*
✅ Why this is the Bridge Pattern
We've decoupled the abstraction (exporting logic per entity) from the implementation (formatting logic).
We can now add new entities or new formats without modifying existing code — just by plugging in new classes.
 */