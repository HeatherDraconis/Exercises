package org.challenges.guess;

public class SystemOutPrinter implements IPrinter{
    @Override
    public void print(String s) {
        System.out.print(s);
    }

    @Override
    public void println(String s) {
        System.out.println(s);
    }
}
