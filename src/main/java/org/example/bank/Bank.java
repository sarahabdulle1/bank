package org.example.bank;

import java.math.BigDecimal;

public class Bank {
    int balance;
    int minimumBalance;
    String accountHolderName;

    //constructor
    public Bank(String accountHolderName, int balance ){
        this.minimumBalance = 0;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    //methods
    public void depositSum(int sum){
        int currentBalance = this.getBalance();
        int newBalance;
        newBalance = currentBalance + sum;
        this.setBalance(newBalance);
    }


    public void withdrawSum(int sum){
        int currentBalance = this.getBalance();
        int newBalance = currentBalance - sum;
        if(newBalance < 0){
            this.setBalance(currentBalance);
        }
        else{
            this.setBalance((newBalance));
        }
    }


    //getters and setters
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(int minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
}
