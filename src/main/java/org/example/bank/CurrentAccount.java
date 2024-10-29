package org.example.bank;

import java.math.BigDecimal;

public class CurrentAccount extends Bank{
    int maxWithdrawal;
    public CurrentAccount(String accountHolderName, int balance, int maxWithdrawal){
        super(accountHolderName, balance);
        this.maxWithdrawal = maxWithdrawal;
    }

    @Override
    public void withdrawSum(int sum){
        int currentBalance = this.getBalance();
        if(sum > this.maxWithdrawal){
            this.setBalance(currentBalance);
        }
        else{
            int newBalance = currentBalance - sum;
            if(newBalance < 0){
                this.setBalance(currentBalance);
            }
            else{
                this.setBalance((newBalance));
            }
        }
    }

}
