package com.listings.lis03;

public class UseBMIClass
{
    public static void main(String[] args)
    {
        BMI bmi1 = new BMI("Kim Yang", 18, 145, 70);
        BMI bmi2 = new BMI("Susan King", 215, 70);
        BMI bmi3 = new BMI("David Cely", 35, 140, 66.92);
        System.out.println(bmi1);
        System.out.println(bmi2);
        System.out.println(bmi3);
    }
}
