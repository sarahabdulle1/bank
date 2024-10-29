package org.example.bank;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class BankTest{

    Bank lbg;
    CurrentAccount newCurrentAccount;

    @Before
    public void setUp(){
        Bank lbg = new Bank("Lloyds", 5000);
    }


    @Test
    public void getBankNameTest(){
        Bank lbg = new Bank("Lloyds", 5000);
        Assert.assertEquals(lbg.getAccountHolderName(), "Lloyds");
    }

    @Test
    public void getBankBalanceTest(){
        Bank lbg = new Bank("Lloyds", 5000);
        Assert.assertEquals(lbg.getBalance(), 5000);
    }

    @Test
    public void getMinimumBalanceTest(){
        Bank lbg = new Bank("Lloyds", 5000);
        Assert.assertEquals(lbg.getMinimumBalance(), 0);
    }

    @Test
    public void canDepositSum(){
        Bank lbg = new Bank("Lloyds", 5000);
        lbg.depositSum(50);
        Assert.assertEquals(lbg.getBalance(), 5050);
    }

    @Test
    public void canWithdrawSum(){
        Bank lbg = new Bank("Lloyds", 5000);
        lbg.withdrawSum(4000);
        Assert.assertEquals(lbg.getBalance(), 1000);
    }


    @Test
    public void canWithdrawFromCurrentAccount(){
        CurrentAccount newCurrentAccount = new CurrentAccount("Lloyds", 5000, 250);
        newCurrentAccount.withdrawSum(200);
        Assert.assertEquals(newCurrentAccount.getBalance(), 4800);
    }

    @Test
    public void canWithdrawFromCurrentAccountOver(){
        CurrentAccount newCurrentAccount = new CurrentAccount("Lloyds", 5000, 250);
        newCurrentAccount.withdrawSum(600);
        Assert.assertEquals(newCurrentAccount.getBalance(), 5800);
    }

    //change int datatype
    @Test
    public void canAddInterest(){
        SavingsAccount newSavingsAccount = new SavingsAccount("Lloyds", 5000, 4);
        newSavingsAccount.addInterest(10);
        Assert.assertEquals(newSavingsAccount.getBalance(), 7041);
    }

}
