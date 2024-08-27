package org.codewars.kata;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LikeSystemTest {
    @Test
    public void staticTests() {
        assertEquals("no one likes this", LikeSystem.whoLikesIt());
        assertEquals("Peter likes this", LikeSystem.whoLikesIt("Peter"));
        assertEquals("Jacob and Alex like this", LikeSystem.whoLikesIt("Jacob", "Alex"));
        assertEquals("Max, John and Mark like this", LikeSystem.whoLikesIt("Max", "John", "Mark"));
        assertEquals("Alex, Jacob and 2 others like this", LikeSystem.whoLikesIt("Alex", "Jacob", "Mark", "Max"));
    }
}