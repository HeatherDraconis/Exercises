package org.javatutorial;

import java.text.NumberFormat;

import java.util.Scanner;

public class MortgageCalculator {
    static final byte PERCENT_CONVERSION_FACTOR = 100;
    static final byte MONTHS_IN_YEARS = 12;

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.print("Principal (£): ");
        double initialAmount = userInput.nextDouble();

        System.out.print("Annual Interest Rate (%): ");
        double annualInterestRate = userInput.nextDouble() / PERCENT_CONVERSION_FACTOR;
        double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEARS;

        System.out.print("Period (Years): ");
        double periodYears = userInput.nextDouble();
        double periodMonths = periodYears * MONTHS_IN_YEARS;

        double interestToApply = Math.pow(1 + monthlyInterestRate, periodMonths);
        double mortgagePayment = initialAmount * monthlyInterestRate * interestToApply / (interestToApply - 1);
        String mortgagePaymentFormatted = NumberFormat.getCurrencyInstance().format(mortgagePayment);
        System.out.println("Mortgage Payment: " + mortgagePaymentFormatted);
    }
}
