package org.challenges.guess;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class YesNoGameTest {
    @Test
    public void testYOnALeaf() {
        TestPrinter printer = new TestPrinter();
        new YesNoGame(new TestSource("y"), new Leaf("item"), printer).run();
        assertEquals("Is it an item? It is an item.", printer.messages);
    }

    @Test
    public void testNOnALeaf() {
        TestPrinter printer = new TestPrinter();
        YesNoGame game = new YesNoGame(new TestSource("n", "item2", "question", "y"), new Leaf("item"), printer);
        game.run();
        assertEquals("Is it an item? What is it? Ah! It is an item2.\r\n" +
                "Please write a \"yes\" or \"no\" question: Is the answer \"yes\" or \"no\"? ", printer.messages);
        assertEquals("{question, Y=item2, N=item}", game.getBaseNode().toString());
    }
}