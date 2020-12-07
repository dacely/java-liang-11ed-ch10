package com.exercises;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class E20_EulerNumber
{
    public static void main(String[] args)
    {
        final int SCALE = 100;
        String numFormat = "%" + (SCALE + 2) + "s";
        BigDecimal e = BigDecimal.ONE.setScale(SCALE, RoundingMode.HALF_EVEN);

        System.out.println("  i  |        Approximate e        ");
        System.out.printf("%6d|" + numFormat + "|\n", 0, e);
        BigInteger iFactorial = BigInteger.ONE;

        for (int i = 1; i <= 1000; i++)
        {
            iFactorial = iFactorial.multiply(BigInteger.valueOf(i));
            BigDecimal nextTerm = BigDecimal.ONE.divide(new BigDecimal(iFactorial), SCALE, RoundingMode.HALF_EVEN);
            e = e.add(nextTerm);

            if (i % 100 == 0)
                System.out.printf("%6d|" + numFormat + "|\n", i, e);
        }
    }

    public static BigInteger factorial(long n)
    {
        BigInteger result = BigInteger.ONE;

        for (int i = 1; i <= n; i++)
            result = result.multiply(BigInteger.valueOf(i));

        return result;
    }
}
