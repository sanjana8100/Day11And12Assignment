package com.bridgelabz;

import java.util.Scanner;

public class StockAccount {
    private String accountName;

    StockAccount(String fileName){
        this.accountName=fileName;
    }

    public String getAccountName() {
        return accountName;
    }

    public double valueOf(){

    }

    public void buy(int amount,String symbol){

    }

    public void sell(int amount,String symbol){

    }

    public void save(String fileName){

    }

    public void printReport(){

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the name of the Account: ");
        String name= in.nextLine();
        StockAccount stockAccount= new StockAccount(name);


    }
}
