package com.listings.lis07;

public class Test
{
    public static void main(String[] args)
    {
        StackOfIntegers stack = new StackOfIntegers();
        for (int i = 0; i < 100; i++)
        {
            stack.push(2 * (i + 1));
            System.out.printf("Push: %5d;   Capacity: %4d;   Size: %4d\n",
                    stack.peek(), stack.getCapacity(), stack.getSize());
        }

        System.out.println("\n**************************************************\n");

        while (!stack.isEmpty())
        {
            System.out.printf("Pop: %5d;   Capacity: %4d;   Size: %4d\n",
                    stack.pop(), stack.getCapacity(), stack.getSize());
        }
    }
}
