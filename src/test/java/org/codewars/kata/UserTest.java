package org.codewars.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class UserTest {
    User user = new User();
    private void do_test(int rank, int expectedRank, int expectedProgress) {
        if(rank!=0) user.incProgress(rank);
        assertEquals(expectedRank, user.rank);
        assertEquals(expectedProgress, user.progress);
    }
    @Test
    public void testIncProgress() throws Exception {
        do_test(-8, -8, 3);

        user = new User();
        do_test(-7, -8, 10);

        user = new User();
        do_test(-6, -8, 40);

        user = new User();
        do_test(-5, -8, 90);

        user = new User();
        do_test(-4, -7, 60);

        user = new User();
        do_test(-8, -8, 3);

        user = new User();
        do_test(1, -2, 40);
        do_test(1, -2, 80);
        do_test(1, -1, 20);
        do_test(1, -1, 30);
        do_test(1, -1, 40);
        do_test(2, -1, 80);
        do_test(2, 1, 20);
        do_test(-1, 1, 21);
    }

    @Test
    public void testIncProgress2() {
        assertThrows( RuntimeException.class, ()->do_test(-9, -9, 3));
    }
}