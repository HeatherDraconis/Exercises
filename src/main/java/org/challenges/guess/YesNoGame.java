package org.challenges.guess;

import java.util.stream.Stream;

public class YesNoGame {
    private final IInputSource inputSource;
    private Node baseNode;
    private final IPrinter printer;

    public YesNoGame(IInputSource inputSource, Node baseNode, IPrinter printer) {

        this.inputSource = inputSource;
        this.baseNode = baseNode;
        this.printer = printer;
    }

    void run() {
        Node currentNode = baseNode;

        boolean result = false;
        Node previousNode = null;
        while (currentNode.getItem() == null) {
            printer.print(currentNode.getQuestion() + " ");
            result = getYesNoFromUser();
            previousNode = currentNode;
            currentNode = currentNode.getNode(result);
        }

        printer.print("Is it " + getAnOrA(currentNode.getItem()) + " " + currentNode.getItem() + "? ");
        if (getYesNoFromUser()) {
            printer.print("It is " + getAnOrA(currentNode.getItem()) + " " + currentNode.getItem() + ".");
        } else {
            printer.print("What is it? ");
            String item = inputSource.nextLine();
            printer.println("Ah! It is " + getAnOrA(item) + " " + item + ".");
            printer.print("Please write a \"yes\" or \"no\" question: ");
            String question = inputSource.nextLine();
            printer.print("Is the answer \"yes\" or \"no\"? ");
            boolean answer = getYesNoFromUser();
            if(previousNode == null) {
                baseNode = Branch.create(answer, question, currentNode, new Leaf(item));
            }
            else {
                previousNode.insertQuestion(result, question, new Leaf(item), answer);
            }
        }
    }

    private boolean getYesNoFromUser() {
        return inputSource.nextLine().toLowerCase().contains("y");
    }

    private static String getAnOrA(String object) {
        return Stream.of("a", "e", "i", "o", "u").anyMatch(object.toLowerCase()::startsWith) ? "an" : "a";
    }

    public Node getBaseNode() {
        return baseNode;
    }
}
