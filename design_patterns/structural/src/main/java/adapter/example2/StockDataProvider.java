package adapter.example2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StockDataProvider {
    public String getStockData() throws IOException {
        // Creating a path choosing file from local
        // directory by creating an object of Path class
        Path fileName
                = Path.of("E:\\Scaler and Study Videos\\Ishan Github\\lld_by_ishan\\design_patterns\\structural\\src\\main\\java\\adapter\\example2\\stock.xml");
        // Now calling Files.readString() method to
        // read the file
        return Files.readString(fileName);
    }
}
