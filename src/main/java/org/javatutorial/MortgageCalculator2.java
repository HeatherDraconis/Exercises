package org.javatutorial;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator2 {
    static final byte PERCENT_CONVERSION_FACTOR = 100;
    static final byte MONTHS_IN_YEARS = 12;

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        double initialAmount;

        while (true) {
            System.out.print("Principal (£): ");
            initialAmount = userInput.nextDouble();
            if (initialAmount <= 1_000_000 && initialAmount >= 1_000) {
                break;
            }
            System.out.println("Principal must be between 1000 and 1000000");
        }

        double percentInterestRate;

        while (true) {
            System.out.print("Annual Interest Rate (%): ");
            percentInterestRate = userInput.nextDouble();
            if (percentInterestRate <= 30 && percentInterestRate >= 1) {
                break;
            }
            System.out.println("Interest Rate must be between 1 and 30");
        }

        double annualInterestRate = percentInterestRate / PERCENT_CONVERSION_FACTOR;
        double monthlyInterestRate = annualInterestRate / MONTHS_IN_YEARS;

        double periodYears;

        while (true) {
            System.out.print("Period (Years): ");
            periodYears = userInput.nextDouble();
            if (periodYears <= 30 && periodYears >= 1) {
                break;
            }
            System.out.println("Period must be between 1 and 30");
        }

        double periodMonths = periodYears * MONTHS_IN_YEARS;

        double interestToApply = Math.pow(1 + monthlyInterestRate, periodMonths);
        double mortgagePayment = initialAmount * monthlyInterestRate * interestToApply / (interestToApply - 1);
        String mortgagePaymentFormatted = NumberFormat.getCurrencyInstance().format(mortgagePayment);
        System.out.println("Mortgage Payment: " + mortgagePaymentFormatted);
    }
}
