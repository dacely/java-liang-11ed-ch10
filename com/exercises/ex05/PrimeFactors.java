package com.exercises.ex05;

import java.util.Scanner;

public class PrimeFactors
{
    public static void main(String[] args)
    {
        StackOfIntegers stack = new StackOfIntegers();
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número entero positivo: ");
        int n = input.nextInt();

        int i = 2;
        while (n > 1)
        {
            if (n % i == 0)
            {
                stack.push(i);
                n /= i;
            }
            else
                ++i;
        }

        System.out.print("Lista de factores primos: ");

        while (stack.getSize() > 1)
            System.out.printf("%d, ", stack.pop());

        if (stack.getSize() == 1)
            System.out.printf("%d", stack.pop());
    }
}
