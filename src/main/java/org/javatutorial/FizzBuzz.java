package org.javatutorial;

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
        }
        else if (divFive) {
            System.out.println("Fizz");
        }
        else if (divThree) {
            System.out.println("Buzz");
        }
        else {
            System.out.println(number);
        }
    }
}
