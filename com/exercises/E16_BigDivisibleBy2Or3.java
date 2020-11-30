package com.exercises;

import java.math.BigInteger;

public class E16_BigDivisibleBy2Or3
{
    public static void main(String[] args)
    {
        BigInteger n = BigInteger.TEN.pow(49);
        BigInteger two = BigInteger.TWO;
        BigInteger three = BigInteger.valueOf(3);
        BigInteger zero = BigInteger.ZERO;

        int i = 0;
        while (i < 10)
        {
            if (n.remainder(two).equals(zero) || n.remainder(three).equals(zero))
            {
                System.out.println(n);
                i++;
            }

            n = n.add(BigInteger.ONE);

        }
    }
}
