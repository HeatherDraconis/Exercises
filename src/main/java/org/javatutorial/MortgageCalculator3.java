package org.javatutorial;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator3 {
    static final byte PERCENT_CONVERSION_FACTOR = 100;
    static final byte MONTHS_IN_YEARS = 12;

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        double initialAmount = getAmount(userInput, "Principal (£)", 1000, 1_000_000);
        double percentInterestRate  = getAmount(userInput, "Annual Interest Rate (%)", 1, 30);
        double periodYears = getAmount(userInput, "Period (Years)", 1, 30);

        double annualInterestRate = percentInterestRate / PERCENT_CONVERSION_FACTOR;
        double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEARS;
        double periodMonths = periodYears * MONTHS_IN_YEARS;

        double interestToApply = Math.pow(1 + monthlyInterestRate, periodMonths);
        double mortgagePayment = initialAmount * monthlyInterestRate * interestToApply / (interestToApply - 1);
        String mortgagePaymentFormatted = NumberFormat.getCurrencyInstance().format(mortgagePayment);
        System.out.println("Mortgage Payment: " + mortgagePaymentFormatted);
    }

    private static double getAmount(Scanner userInput, String valueName, int minValue, int maxValue) {
        while (true) {
            System.out.print(valueName + ": ");
            double amount = userInput.nextDouble();
            if (amount <= maxValue && amount >= minValue) {
                return amount;
            }
            System.out.println(valueName +" must be between " + minValue + " and " + maxValue);
        }
    }
}
