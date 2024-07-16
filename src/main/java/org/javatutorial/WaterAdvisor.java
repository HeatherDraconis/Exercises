package org.javatutorial;

import java.util.Scanner;

public class WaterAdvisor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Temperature: ");
        int temp = scanner.nextInt();

        if (temp > 30) {
            System.out.println("Hot Day!");
            System.out.println("Water needed...");
        }
        else if (temp > 20) {
            System.out.println("Pretty Day!");
        }
        else {
            System.out.println("Cold!!!");
        }
    }
}
