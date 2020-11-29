package com.exercises.ex12;

public class MySegment
{
    private final MyPoint A;
    private final MyPoint B;

    public MySegment(MyPoint A, MyPoint B)
    {
        this.A = A;
        this.B = B;
    }

    private boolean isolateEndPoints(MySegment s2)
    {
        MyVectorR3 v1 = new MyVectorR3(B.getX() - A.getX(), B.getY() - A.getY(), 0); // vector A -> B
        MyVectorR3 v2 = new MyVectorR3(s2.A.getX() - A.getX(), s2.A.getY() - A.getY(), 0); // vector A -> C
        MyVectorR3 v3 = new MyVectorR3(s2.B.getX() - A.getX(), s2.B.getY() - A.getY(), 0); // vector A -> D

        MyVectorR3 n1 = v1.crossProduct(v2);
        MyVectorR3 n2 = v1.crossProduct(v3);

        return n1.dot(n2) <= 0;
    }

    public boolean intersects(MySegment s2)
    {
        if (A.equals(s2.A) || A.equals(s2.B) || B.equals(s2.A) || B.equals(s2.B))
            return true;

        return this.isolateEndPoints(s2) && s2.isolateEndPoints(this);
    }
}
