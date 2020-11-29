package com.listings.lis09;

import java.math.BigInteger;
import java.util.Scanner;

public class LargeFactorial
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        long n = input.nextLong();
        System.out.printf("%d! is \n %s", n, factorial(n));
    }

    public static BigInteger factorial(long n)
    {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= n; i++)
            result = result.multiply(new BigInteger(i + ""));

        return result;
    }
}
