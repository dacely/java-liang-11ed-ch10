package com.exercises.ex03;

public class Test
{
    public static void main(String[] args)
    {
        MyInteger myInteger1 = new MyInteger(9973);
        MyInteger myInteger2 = new MyInteger(1234);
        MyInteger myInteger3 = new MyInteger(7);
        MyInteger myInteger4 = new MyInteger(9973);
        char[] charArray = {'-', '2', '0', '4', '9', '3', '9', '5'};
        String strNumber = "123456789";

        System.out.println(myInteger1 + " is even: " + myInteger1.isEven());
        System.out.println(myInteger1 + " is odd: " + myInteger1.isOdd());
        System.out.println(myInteger1 + " is prime: " + myInteger1.isPrime());
        System.out.println();

        System.out.println(myInteger2 + " is even: " + myInteger2.isEven());
        System.out.println(myInteger2 + " is odd: " + myInteger2.isOdd());
        System.out.println(myInteger2 + " is prime: " + myInteger2.isPrime());
        System.out.println();

        System.out.println(555 + " is even: " + MyInteger.isEven(555));
        System.out.println(555 + " is odd: " + MyInteger.isOdd(555));
        System.out.println(555 + " is prime: " + MyInteger.isPrime(555));
        System.out.println();

        System.out.println(myInteger3 + " is even: " + MyInteger.isEven(myInteger3));
        System.out.println(myInteger3 + " is odd: " + MyInteger.isOdd(myInteger3));
        System.out.println(myInteger3 + " is prime: " + MyInteger.isPrime(myInteger3));
        System.out.println();


        System.out.println("myInteger1.equals(9973): " +  myInteger1.equals(9973));
        System.out.println("myInteger1.equals(9974): " +  myInteger1.equals(9974));
        System.out.println("myInteger1 == myInteger4: " +  (myInteger1 == myInteger4));
        System.out.println("myInteger1.equals(myInteger4): " +  myInteger1.equals(myInteger4));
        System.out.println("myInteger1.equals(myInteger2): " +  myInteger1.equals(myInteger2));

        System.out.println(MyInteger.parseInt(charArray));
        System.out.println(MyInteger.parseInt(strNumber));
    }
}
