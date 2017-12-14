package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int balance;
    
    public Account() {
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int n) {
        balance += n;
    }

    public void withdraw(int n) {
        if (n <= balance)
            balance -= n;
    }
}
