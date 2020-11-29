package com.exercises.ex12;

public class TestMyVector
{
    public static void main(String[] args)
    {
        MyVectorR3 u = new MyVectorR3(1, -1, 2);
        MyVectorR3 v = new MyVectorR3(2, 3, -4);
        MyVectorR3 w1 = u.crossProduct(v);
        MyVectorR3 w2 = v.crossProduct(u);
        System.out.println(u);
        System.out.println(v);
        System.out.println(w1);
        System.out.println(w2);
        System.out.println(u.dot(w1));
        System.out.println(v.dot(w1));
        System.out.println(u.dot(w2));
        System.out.println(v.dot(w2));
    }
}
