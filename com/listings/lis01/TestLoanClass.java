package com.listings.lis01;

import java.util.Scanner;

public class TestLoanClass
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la tasa de interes anual, por ejemplo, 8,25: ");
        double annualInterestRate = input.nextDouble();
        System.out.print("Ingrese el numero de anios: ");
        int years = input.nextInt();
        System.out.print("Ingrese el monto del prestamo, por ejemplo, 12000000,95: ");
        double amount = input.nextDouble();

        Loan loan = new Loan(annualInterestRate, years, amount);
        System.out.println(loan);
    }
}
