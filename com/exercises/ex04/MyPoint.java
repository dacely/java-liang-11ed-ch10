package com.exercises.ex04;

public class MyPoint
{
    private final double x;
    private final double y;

    public MyPoint(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public MyPoint()
    {
        this(0.0, 0.0);
    }

    public double distance(double x, double y)
    {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    public double distance(MyPoint point)
    {
        return distance(point.x, point.y);
    }

    public static double distance(MyPoint p1, MyPoint p2)
    {
        return p1.distance(p2);
    }
}
