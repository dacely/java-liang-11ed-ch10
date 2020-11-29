package com.exercises.ex12;

public class MyTriangle
{
    private MyPoint p1;
    private MyPoint p2;
    private MyPoint p3;

    //region Constructors, Getter and Setters
    public MyTriangle(MyPoint p1, MyPoint p2, MyPoint p3)
    {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public MyPoint getP1()
    {
        return p1;
    }

    public void setP1(MyPoint p1)
    {
        this.p1 = p1;
    }

    public MyPoint getP2()
    {
        return p2;
    }

    public void setP2(MyPoint p2)
    {
        this.p2 = p2;
    }

    public MyPoint getP3()
    {
        return p3;
    }

    public void setP3(MyPoint p3)
    {
        this.p3 = p3;
    }
    //endregion

    public double getArea()
    {
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p1.distance(p2);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double getPerimeter()
    {
        double a = p1.distance(p2);
        double b = p1.distance(p3);
        double c = p1.distance(p2);
        return a + b + c;
    }

    public boolean contains(MyPoint p)
    {
        MySegment side1 = new MySegment(p1, p2);
        MySegment side2 = new MySegment(p1, p3);
        MySegment side3 = new MySegment(p2, p3);
        MySegment segment1 = new MySegment(p, p1);
        MySegment segment2 = new MySegment(p, p2);
        MySegment segment3 = new MySegment(p, p3);

        boolean c1 = segment1.intersects(side3);
        boolean c2 = segment2.intersects(side2);
        boolean c3 = segment3.intersects(side1);

        return !(c1 || c2 || c3);
    }

    public boolean contains(MyTriangle t)
    {
        return contains(t.p1) && contains(t.p2) && contains(t.p3);
    }

    public boolean overlaps(MyTriangle t)
    {
        MySegment a1 = new MySegment(p1, p2);
        MySegment b1 = new MySegment(p1, p3);
        MySegment c1 = new MySegment(p2, p3);
        MySegment a2 = new MySegment(t.p1, t.p2);
        MySegment b2 = new MySegment(t.p1, t.p3);
        MySegment c2 = new MySegment(t.p2, t.p3);

        return a1.intersects(a2) || a1.intersects(b2) || a1.intersects(c2)
                || b1.intersects(a2) || b1.intersects(b2) || b1.intersects(c2)
                || c1.intersects(a2) || c1.intersects(b2) || c1.intersects(c2);
    }

    @Override
    public String toString()
    {
        String str = "{\n\tVertices:";
        str += "\n\t\tp1: " + p1;
        str += "\n\t\tp2: " + p2;
        str += "\n\t\tp3: " + p3;
        str += String.format("\n\tArea: %.2f", getArea());
        str += String.format("\n\tPerimeter: %.2f\n}", getPerimeter());
        return str;
    }
}
