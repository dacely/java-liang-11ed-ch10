package com.exercises.ex12;

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

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public boolean equals(MyPoint p2)
    {
        return Math.abs(this.x - p2.x) < 1E-14 && Math.abs(this.y - p2.y) < 1E-14;
    }

    @Override
    public String toString()
    {
        return String.format("(%.2f, %.2f)", x, y);
    }
}
