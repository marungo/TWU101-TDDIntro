package com.thoughtworks.tddintro.exercises.accountbalance;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class AccountTests {
    private static Account account;

    @Before
    public void setUp() throws Exception {
        account = new Account();
        account.setBalance(100);
    }

    @Test
    // Remove each @Ignore and implement test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        account.deposit(50);

        Integer result = account.getBalance();
        assertThat(result, is(150));
    }

    @Test
    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
        account.withdraw(50);

        Integer result = account.getBalance();
        assertThat(result, is(50));
    }

    @Test
    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
        account.withdraw(150);

        Integer result = account.getBalance();
        assertThat(result, is(100));
    }
}
