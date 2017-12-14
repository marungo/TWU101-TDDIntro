package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int n) throws IllegalArgumentException {
        if (n < 0)
            throw new IllegalArgumentException(Integer.toString(n));

        if (n == 0 || n == 1)
            return 1;
        else
            return n*compute(n-1);
    }
}
