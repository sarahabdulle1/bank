package org.example.bank;

import java.math.BigDecimal;

public class SavingsAccount extends Bank {
    int interestRate;

    public SavingsAccount(String accountHolderName, int balance, int interestRate){
        super(accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void addInterest(int years){
        int newBalance = years * balance * interestRate;
        this.setBalance(newBalance);
    }
}
