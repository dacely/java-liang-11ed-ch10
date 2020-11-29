package com.exercises.ex12;

public class MyVectorR3
{
    private final double x;
    private final double y;
    private final double z;

    public MyVectorR3(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double dot(MyVectorR3 v2)
    {
        return this.x * v2.x  + this.y * v2.y + this.z * v2.z;
    }

    public MyVectorR3 crossProduct(MyVectorR3 v2)
    {
        return new MyVectorR3(
                this.y * v2.z - this.z * v2.y,
                this.z * v2.x - this.x * v2.z,
                this.x * v2.y - this.y * v2.x);
    }

    @Override
    public String toString()
    {
        return String.format("<%.2f, %.2f, %.2f>", x, y, z);
    }
}
