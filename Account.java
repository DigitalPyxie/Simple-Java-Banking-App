package com.kekeletso;

import java.util.Scanner;

public class Account {

    Scanner user = new Scanner(System.in);

    //Class variables
    int balance;
    int transactionHistory;
    int accountNumber;
    String customerName;

    //Class constructor
    Account(String user, int accNum){
        customerName = user;
        accountNumber = accNum;
    }

    //Functions for all activities user can perform
    //Deposit money
    void deposit(int amount){
        if (amount != 0){
            balance = balance + amount;
            transactionHistory = amount;
        }
    }
    //Withdraw money
    void withdraw(int amount){
        if (amount != 0){
            balance = balance - amount;
            transactionHistory = -amount;
        }
    }
    //Transfer between accounts
    //Transfer from Cheque account to savings account

    //Show the transaction history
    void getTransactionHistory(){
        if(transactionHistory > 0){
            System.out.println("Deposited: $" + transactionHistory);
        } else if (transactionHistory <0){
            System.out.println("Withdrawn: $" + Math.abs(transactionHistory));
        } else {
            System.out.println("No Account activity.");
        }
    }
    //Main Menu with options
    void bankMenu() {
        int option;

        System.out.println("Welcome " + customerName + "\nAccount: " + accountNumber);
        System.out.println("Please select from the options below: ");
        System.out.println("1. Display Balance");
        System.out.println("2. Deposit into Cheque Account");
        System.out.println("3. Withdraw from Cheque Account");
        System.out.println("4. View Transaction History");
        System.out.println("5. Exit");

        do {
            System.out.print("Enter your option: ");
            option = user.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Account Balances: \nCheque: \t$" + balance);
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Enter deposit amount into Cheque Account: ");
                    int amount = user.nextInt();
                    deposit(amount);
                    System.out.println("$" + amount + " deposited into Cheque Account.");
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw from Cheque Account: ");
                    int amount2 = user.nextInt();
                    withdraw(amount2);
                    System.out.println("$" + amount2 + " withdrawn from Cheque Amount.");
                    System.out.println();
                    break;

                case 4:
                    System.out.println("Transaction History: \n");
                    getTransactionHistory();
                    System.out.println();
                    break;

                case 5:
                    System.out.println("---------------------------------");
                    break;

                default:
                    System.out.println("Please enter from the options provided.");
                    break;

            }

        } while (option != 5);
        System.out.println("Thank you for banking with us!");
    }
}
