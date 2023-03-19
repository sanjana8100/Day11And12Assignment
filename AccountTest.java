package com.bridgelabz;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        Account account = new Account(balance);

        System.out.print("Enter debit amount: ");
        double amount = scanner.nextDouble();

        account.debit(amount);

        System.out.println("Current balance: " + account.getBalance()+" Rupees");

    }
}
