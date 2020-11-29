package com.listings.lis10;

import java.util.Scanner;

public class TestPalindrome
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String strUser = input.nextLine();
        String result = Palindrome.isPalindrome(strUser) ? "SI" : "NO";
        System.out.println("Teniendo en cuenta unicamente los caracteres alfanuméricos");
        System.out.printf("el texto ingresado %s palindrome", result);
    }
}
