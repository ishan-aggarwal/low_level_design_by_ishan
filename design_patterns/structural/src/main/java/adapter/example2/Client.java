package adapter.example2;

import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IOException {
        StockDataProvider stockDataProvider = new StockDataProvider();

        System.out.println("--- Get stock data ---");
        String stockData = stockDataProvider.getStockData();
        System.out.println(stockData);

        System.out.println("--- Use adapter pattern ---");
        JsonAdapter jsonAdapter = new JsonAdapter(new Analytics());
        jsonAdapter.convertAndPerformAnalysis(stockData);
    }
}
