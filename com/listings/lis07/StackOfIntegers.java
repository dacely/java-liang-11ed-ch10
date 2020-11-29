package com.listings.lis07;

public class StackOfIntegers
{
    private int[] elements;
    private int size;

    public StackOfIntegers(int capacity)
    {
        elements = new int[capacity];
    }

    public StackOfIntegers()
    {
        this(16);
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public int peek()
    {
        if (!isEmpty())
            return elements[size - 1];

        return 0;
    }

    public void push(int value)
    {
        if (elements.length == size)
        {
            int[] temp = new int[2 * size];
            System.arraycopy(elements, 0, temp, 0, size);
            elements = temp;
        }

        elements[size++] = value;
    }

    public int pop()
    {
        if (isEmpty())
            return 0;
        else
            return elements[(size--) - 1];
    }

    public int getSize()
    {
        return size;
    }

    public int getCapacity()
    {
        return elements.length;
    }
}
