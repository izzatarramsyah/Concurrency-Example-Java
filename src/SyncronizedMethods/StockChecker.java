package SyncronizedMethods;

public class StockChecker {
    
    private int stock = 20;

    public int getStock() {
        return stock;
    }

    public void updateStock(int amount) {
        stock -= amount;
    }
    
}
