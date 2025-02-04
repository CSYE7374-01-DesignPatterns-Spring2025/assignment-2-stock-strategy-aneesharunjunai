package edu.neu.csye7374;

public class StockMarket {
    public static void stockMarket() {
        Stock bullStock = new BullStock();
        Stock bearStock = new BearStock();

        bullStock.setStrategy(BullMarketStrategy.getInstance());
        bearStock.setStrategy(BearMarketStrategy.getInstance());

        bullStock.computeNewPrice();
        bullStock.displayPrice();

        bearStock.computeNewPrice();
        bearStock.displayPrice();
    }
}
