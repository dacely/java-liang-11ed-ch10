package com.exercises.ex18;

import java.math.BigInteger;

public class MersennePrimes
{
    public static void main(String[] args)
    {
        System.out.printf("   p   |%1$11s 2^p - 1 %1$11s|%1$30s Perfect Number %1$30s\n", "");
        for (int i = 1; i <= 100; i++)
        {
            if (MyPrimes.isPrime(i))
            {
                BigInteger M = BigInteger.TWO.pow(i).subtract(BigInteger.ONE);
                boolean isMersennePrime = false;


                if (i <= 13)
                {
                    if (MyPrimes.isPrime(M))
                        isMersennePrime = true;
                }
                else
                {
                    if (MyPrimes.isBigPrime(M))
                        isMersennePrime = true;
                }

                if (isMersennePrime)
                {
                    BigInteger perfect = M.multiply(BigInteger.TWO.pow(i-1));
                    System.out.printf("%7d|%31s|%76s|\n", i, M, perfect);
                }
            }
        }
    }
}
