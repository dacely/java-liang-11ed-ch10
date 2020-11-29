package com.checkpoints;

public class Checkpoint_10_01
{
    public static void main(String[] args)
    {
        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = "Welcome to Java";

        System.out.println("s1 == s2: " + (s1 == s2)); // true
        System.out.println("s1 == s3: " + (s1 == s3)); // false
        System.out.println("s1 == s4: " + (s1 == s4)); // true
        System.out.println("s1.equals(s3): " + (s1.equals(s3))); // true
        System.out.println("s1.equals(s4): " + (s1.equals(s4))); // true
        System.out.println("Welcome to Java".replace("Java", "HTML")); // Welcome to HTML
        System.out.println(s1.replace('o', 'T')); // "WelcTme tT Java"
        System.out.println(s1.replaceAll("o", "T")); // "WelcTme tT Java"
        System.out.println(s1.replaceFirst("o", "T")); // "WelcTme to Java"
        System.out.println(s1.toCharArray()); // [W, e, l, c, o, m, e,  , t, o,  , J, a, v, a]
    }
}
