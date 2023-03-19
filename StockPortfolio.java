package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockPortfolio {
    private List<Stock> stocks;

    public StockPortfolio() {
        stocks = new ArrayList<>();
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public double getTotalValue() {
        double totalValue = 0;
        for (Stock stock : stocks) {
            totalValue += stock.getValue();
        }
        return totalValue;
    }

    public void printStockReport() {
        System.out.println("Stock Report:");
        System.out.println(stocks);
        System.out.println();
        System.out.println("Total Stock Value: Rs. " + getTotalValue());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of stocks: ");
        int numStocks = scanner.nextInt();

        StockPortfolio portfolio = new StockPortfolio();

        for (int i = 1; i <= numStocks; i++) {
            System.out.println("Enter details of stock #" + i + ":");
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Number of shares: ");
            int numShares = scanner.nextInt();
            System.out.print("Share price: ");
            double sharePrice = scanner.nextDouble();

            Stock stock = new Stock(name, numShares, sharePrice);
            portfolio.addStock(stock);
        }

        portfolio.printStockReport();
    }
}
