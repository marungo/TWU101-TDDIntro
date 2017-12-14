package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    @Test
    // Remove each @Ignore and implement test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account();
        account.deposit(10);
        account.deposit(10);

        Integer result = account.getBalance();
        assertThat(result, is(20));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        Account account = new Account();
        account.deposit(50);
        account.withdraw(10);
        account.withdraw(10);

        Integer result = account.getBalance();
        assertThat(result, is(30));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        Account account = new Account();
        account.deposit(10);
        account.withdraw(40);

        Integer result = account.getBalance();
        assertThat(result, is(10));
    }
}
