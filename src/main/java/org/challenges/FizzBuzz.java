package org.challenges;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        double number = scanner.nextDouble();
        double five = (number / 5);
        boolean divFive = Math.round(five) == five;
        double three = (number / 3);
        boolean divThree = Math.round(three) == three;
        if (divFive && divThree) {
            System.out.println("FizzBuzz");
        } else if (divFive) {
            System.out.println("Fizz");
        } else if (divThree) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }

    public static String getAnswer(int number) {
        double five = (number / 5.0);
        boolean divFive = Math.round(five) == five;
        double three = (number / 3.0);
        boolean divThree = Math.round(three) == three;
        if (divFive && divThree) {
            return "FizzBuzz";
        } else if (divFive) {
            return "Fizz";
        } else if (divThree) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }

    }

    public static String getAnswer2(int number) {
        boolean divFive = number % 5 == 0;
        boolean divThree = number % 3 == 0;
        if (divFive && divThree) {
            return "FizzBuzz";
        }
        if (divThree) {
            return "Buzz";
        }
        if (divFive) {
            return "Fizz";
        }
        return String.valueOf(number);
    }
}
