package edu.neu.csye7374;

public class Stock {

        protected double price;
        private PriceCalculationStrategy strategy;

        public void setStrategy(PriceCalculationStrategy strategy) {
            this.strategy = strategy;
        }

        public void computeNewPrice() {
            strategy.computeNewPrice(this);
        }

        public void displayPrice() {
            System.out.println("Stock Price: " + price);
        }
}
