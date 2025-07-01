package org.challenges.guess;

public class TestPrinter implements IPrinter {
    String messages = "";
    @Override
    public void print(String s) {
        messages += s;
    }

    @Override
    public void println(String s) {
        print(s + "\r\n");
    }
}
