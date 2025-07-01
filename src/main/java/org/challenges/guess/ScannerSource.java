package org.challenges.guess;

import java.util.Scanner;

public class ScannerSource implements IInputSource {
    private final Scanner scanner;

    public ScannerSource() {
        scanner = new Scanner(System.in);
    }

    @Override
    public String nextLine() {
        return scanner.nextLine();
    }
}
