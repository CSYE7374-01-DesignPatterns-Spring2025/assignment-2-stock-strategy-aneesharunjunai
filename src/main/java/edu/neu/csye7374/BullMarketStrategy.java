package edu.neu.csye7374;

import java.util.Random;

public class BullMarketStrategy implements  PriceCalculationStrategy{
    private static BullMarketStrategy instance = new BullMarketStrategy();

    private BullMarketStrategy() {
        // Private constructor to enforce Singleton pattern
    }

    public static BullMarketStrategy getInstance() {
        return instance;
    }

    @Override
    public void computeNewPrice(Stock stock) {
        // Implement Bull market price calculation logic
        // For example, increase the price by a random value
        Random random = new Random();
        double increase = random.nextDouble() * 10;
        stock.price += increase;
    }
}
