package com.exercises;

import java.math.BigInteger;

public class E17_BigSquareNumbers
{
    public static void main(String[] args)
    {
        String maxLong = String.format("%,d", Long.MAX_VALUE).replace('.', ' ');
        String maxInt = String.format("%,d", Integer.MAX_VALUE).replace('.', ' ');
        System.out.println("Max long: " + maxLong);
        System.out.println("Max int: " + maxInt);

        BigInteger big = BigInteger
                .valueOf(Long.MAX_VALUE)
                .sqrt()
                .add(BigInteger.ONE);

        for (int i = 1; i <= 10; i++)
        {
            System.out.printf("%d) %s^2 = %s\n", i, big, big.pow(2));
            big = big.add(BigInteger.ONE);
        }
    }
}
