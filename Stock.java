package com.bridgelabz;

public class Stock {
    private String stockName;
    private int numberOfShares;
    private double sharePrice;

    public Stock(String stockName, int numberOfShares, double sharePrice) {
        this.stockName=stockName;
        this.numberOfShares=numberOfShares;
        this.sharePrice=sharePrice;
    }

    public String getStockName() { return stockName; }

    public int getNumberOfShares() { return numberOfShares; }

    public double getSharePrice() {
        return sharePrice;
    }

    public double getValue() {
        return numberOfShares * sharePrice;
    }

    @Override
    public String toString() {
        return  "Stock Name: '" + stockName + '\'' +
                "\t numberOfShares: " + numberOfShares +
                "\t sharePrice: " + sharePrice +
                '\n';
    }

}
