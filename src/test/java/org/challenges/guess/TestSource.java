package org.challenges.guess;

import java.util.NoSuchElementException;

public class TestSource implements IInputSource {
    private final String[] entries;
    private int count = -1;
    public TestSource(String... entries) {
        this.entries = entries;
    }

    @Override
    public String nextLine() {
        count++;
        if (count > entries.length) {
            throw new NoSuchElementException();
        }
        return entries[count];
    }
}
