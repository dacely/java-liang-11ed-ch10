package com.listings.lis01;

import java.util.GregorianCalendar;

public class Loan
{
    private final double annualInterestRate;
    private final int numberOfYears;
    private final double loanAmount;
    private final GregorianCalendar loanDate;

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
    {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new GregorianCalendar();
    }

    public double getMonthlyPayment()
    {
        double monthlyInterestRate = annualInterestRate / 1200;
        return loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
    }

    public double getTotalPayment()
    {
        return 12 * getMonthlyPayment() * numberOfYears;
    }

    @Override
    public String toString()
    {
        String str = String.format("El prestamo fue creado el %1$te de %1$tB de %1$tY a las %1$tr\n", loanDate);
        str += String.format("La cuota mensual es de %.2f\n", getMonthlyPayment());
        str += String.format("El valor total a pagar es de %.2f\n", getTotalPayment());
        return str;
    }
}
