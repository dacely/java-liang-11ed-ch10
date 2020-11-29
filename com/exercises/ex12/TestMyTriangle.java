package com.exercises.ex12;

public class TestMyTriangle
{
    public static void main(String[] args)
    {
        MyTriangle t1 = new MyTriangle(
                new MyPoint(2.5, 1),
                new MyPoint(4.2, 3),
                new MyPoint(5.3, 2.6));

        MyTriangle t2 = new MyTriangle(
                new MyPoint(5, 3.2),
                new MyPoint(4.4, 3.1),
                new MyPoint(5.9, 2.4));

        System.out.println("t1: \n" + t1 + "\n");
        System.out.println("t2: \n" + t2 + "\n");

        System.out.println("t1.contains(t2): " + t1.contains(t2));
        System.out.println("t2.contains(t1): " + t2.contains(t1));
        System.out.println("t1.overlaps(t2): " + t1.overlaps(t2));
        System.out.println("t2.overlaps(t1): " + t2.overlaps(t1));
    }
}
