package com.exercises.ex06;

public class PrimeNumbers
{
    public static void main(String[] args)
    {
        StackOfIntegers stack = new StackOfIntegers();
        int i = 1;
        while (i <= 120)
        {
            if (isPrime(i))
                stack.push(i);

            i++;
        }

        System.out.print("Primos menores a 120: ");

        while (stack.getSize() > 1)
            System.out.printf("%d, ", stack.pop());

        if (stack.getSize() == 1)
            System.out.printf("%d", stack.pop());
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
}
