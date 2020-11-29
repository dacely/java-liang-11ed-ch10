package com.exercises.ex03;

public class MyInteger
{
    private final int value;

    public MyInteger(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value;
    }

    public boolean isPrime()
    {
        return MyInteger.isPrime(value);
    }

    public boolean isEven()
    {
        return MyInteger.isEven(value);
    }

    public boolean isOdd()
    {
        return MyInteger.isOdd(value);
    }

    public static boolean isPrime(int n)
    {
        if (n < 2) return false;
        if (n == 2 || n == 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        int sqrtN = (int) Math.sqrt(n) + 1;

        for (int i = 6; i <= sqrtN; i += 6)
        {
            if (n % (i - 1) == 0 || n % (i + 1) == 0)
                return false;
        }

        return true;
    }

    public static boolean isEven(int n)
    {
        return n % 2 == 0;
    }

    public static boolean isOdd(int n)
    {
        return n % 2 != 0;
    }

    public static boolean isPrime(MyInteger myInteger)
    {
        return MyInteger.isPrime(myInteger.getValue());
    }

    public static boolean isEven(MyInteger myInteger)
    {
        return MyInteger.isEven(myInteger.getValue());
    }

    public static boolean isOdd(MyInteger myInteger)
    {
        return MyInteger.isOdd(myInteger.getValue());
    }

    public boolean equals(int n)
    {
        return value == n;
    }

    public boolean equals(MyInteger myInteger)
    {
        return value == myInteger.getValue();
    }

    public static int parseInt(char[] digits)
    {
        if (digits.length == 0)
            return 0;

        int sign = 1;
        int k = 0;
        if (digits[0] == '-')
        {
            sign = -1;
            k = 1;
        }

        int result = 0;
        for (int i = k; i < digits.length; i++)
        {
            int x = Character.getNumericValue(digits[i]);
            x *= (int) (Math.pow(10, digits.length - i - 1));
            result += x;
        }

        return result * sign;
    }

    public static int parseInt(String s)
    {
        return parseInt(s.toCharArray());
    }

    @Override
    public String toString()
    {
        return "MyInteger{" +
                "value=" + value +
                '}';
    }
}

