package org.challenges.guess;

import java.io.Serializable;

public interface Node extends Serializable{
    Node getNode(boolean result);

    void insertQuestion(boolean result, String question, Leaf leaf, boolean answer);

    String getItem();

    String getQuestion();
}
