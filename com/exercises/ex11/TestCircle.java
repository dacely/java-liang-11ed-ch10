package com.exercises.ex11;

public class TestCircle
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(0.5, 5.1, 13);
        Circle c2 = new Circle(1, 1.7, 4.5);
        System.out.printf("c1: %s\n", c1);
        System.out.printf("c2: %s\n", c2);
        System.out.printf("c1 is inside c2: %b\n", c2.contains(c1));
        System.out.printf("c2 is inside c1: %b\n", c1.contains(c2));
        System.out.printf("c1 overlaps c2: %b\n", c1.overlaps(c2));
        System.out.printf("c2 overlaps c1: %b\n", c2.overlaps(c1));
        System.out.println("\n");

        c1 = new Circle(3.4, 5.7, 5.5);
        c2 = new Circle(6.7, 3.5, 3);
        System.out.printf("c1: %s\n", c1);
        System.out.printf("c2: %s\n", c2);
        System.out.printf("c1 is inside c2: %b\n", c2.contains(c1));
        System.out.printf("c2 is inside c1: %b\n", c1.contains(c2));
        System.out.printf("c1 overlaps c2: %b\n", c1.overlaps(c2));
        System.out.printf("c2 overlaps c1: %b\n", c2.overlaps(c1));
        System.out.println("\n");

        c1 = new Circle(3.4, 5.5, 1);
        c2 = new Circle(5.5, 7.2, 1);
        System.out.printf("c1: %s\n", c1);
        System.out.printf("c2: %s\n", c2);
        System.out.printf("c1 is inside c2: %b\n", c2.contains(c1));
        System.out.printf("c2 is inside c1: %b\n", c1.contains(c2));
        System.out.printf("c1 overlaps c2: %b\n", c1.overlaps(c2));
        System.out.printf("c2 overlaps c1: %b\n", c2.overlaps(c1));
        System.out.println("\n");
    }
}
