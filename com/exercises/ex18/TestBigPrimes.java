package com.exercises.ex18;

import java.math.BigInteger;

public class TestBigPrimes
{
    public static void main(String[] args)
    {
        int i = 0;
        BigInteger big = BigInteger.valueOf(Long.MAX_VALUE);
//        BigInteger big = BigInteger.ONE;

        while (i < 5)
        {
            if (MyPrimes.isBigPrime(big))
            {
                System.out.println(big);
                i++;
            }

            big = big.add(BigInteger.TWO);
        }
    }
}
