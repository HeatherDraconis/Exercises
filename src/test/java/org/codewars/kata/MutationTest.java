package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MutationTest {
    @Test
    public void basicTests() {
        String[] alice = new String[]{"plat", "rend", "bear", "soar", "mare", "pare", "flap", "neat", "clan", "pore"};
        String[] bob = new String[]{"boar", "clap", "mere", "lend", "near", "peat", "pure", "more", "plan", "soap"};
        assertEquals( 0, Mutation.mutations(alice, bob, "maze", 0)); // Alice goes  first, Alice   wins
        assertEquals( 1, Mutation.mutations(alice, bob, "send", 0)); // Alice goes  first, Bob     wins
        assertEquals( 1, Mutation.mutations(alice, bob, "boat", 0)); // Alice fails first, Bob     wins
        assertEquals(-1, Mutation.mutations(alice, bob, "apse", 0)); // Alice fails first, neither wins
        assertEquals( 1, Mutation.mutations(alice, bob, "flap", 1)); // Bob   goes  first, Bob     wins
        assertEquals( 0, Mutation.mutations(alice, bob, "soar", 1)); // Bob   goes  first, Alice   wins
        assertEquals( 0, Mutation.mutations(alice, bob, "more", 1)); // Bob   fails first, Alice   wins
        assertEquals(-1, Mutation.mutations(alice, bob, "calm", 1)); // Bob   fails first, neither wins
    }
}