package com.exercises.ex11;

public class Circle
{
    private final MyPoint center;
    private final double radius;

    public Circle(MyPoint center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public Circle(double centerX, double centerY, double radius)
    {
        center = new MyPoint(centerX, centerY);
        this.radius = radius;
    }

    public Circle()
    {
        this(0, 0, 1);
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    public boolean contains(MyPoint point)
    {
        return center.distance(point) < radius;
    }

    public boolean contains(Circle circle)
    {
        if (this.radius <= circle.radius)
            return false;
        else
        {
            double distanceBetweenCenters = this.center.distance(circle.center);
            double radiiDifference = this.radius - circle.radius;
            return distanceBetweenCenters < radiiDifference;
        }
    }

    public boolean overlaps(Circle circle)
    {
        if (this.contains(circle) || circle.contains(this))
            return false;
        else
        {
            double distanceBetweenCenters = this.center.distance(circle.center);
            double radiiSum = this.radius + circle.radius;
            return distanceBetweenCenters < radiiSum;
        }
    }

    @Override
    public String toString()
    {
        return String.format("{\n\tCenter: (%.2f, %.2f)\n\tRadius: %.2f\n\tArea: %.2f\n\tPerimeter: %.2f\n}",
                center.getX(), center.getY(), radius, getArea(), getPerimeter());
    }
}
