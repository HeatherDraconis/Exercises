package org.challenges.guess;

public class Leaf implements Node {
    private static final long serialVersionUID = 1;
    private final String item;

    public Leaf(String name) {
        this.item = name;
    }

    @Override
    public Node getNode(boolean result) {
        return null;
    }

    @Override
    public void insertQuestion(boolean result, String question, Leaf leaf, boolean answer) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getItem() {
        return item;
    }

    @Override
    public String getQuestion() {
        return null;
    }

    @Override
    public String toString() {
        return item;
    }
}
