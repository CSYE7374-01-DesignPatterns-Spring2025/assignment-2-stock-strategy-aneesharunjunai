package edu.neu.csye7374;

import java.util.Random;

public class BearMarketStrategy implements PriceCalculationStrategy{
    private static BearMarketStrategy instance = new BearMarketStrategy();

    private BearMarketStrategy() {
        // Private constructor to enforce Singleton pattern
    }

    public static BearMarketStrategy getInstance() {
        return instance;
    }

    @Override
    public void computeNewPrice(Stock stock) {
        // Implement Bear market price calculation logic
        // For example, decrease the price by a random value
        Random random = new Random();
        double decrease = random.nextDouble() * 10;
        stock.price -= decrease;
    }
}
