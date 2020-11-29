package com.exercises.ex04;

public class Test
{
    public static void main(String[] args)
    {
        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);
        System.out.println("Distance: " + MyPoint.distance(p1, p2));
    }
}
