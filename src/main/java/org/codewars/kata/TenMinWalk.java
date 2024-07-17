package org.codewars.kata;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        if (walk.length != 10) {
            return false;
        }
        int walkNorth = 0;
        int walkEast = 0;
        for (char c: walk) {
            switch (c) {
                case 'n':
                    walkNorth++;
                    break;
                case 's':
                    walkNorth--;
                    break;
                case 'e':
                    walkEast++;
                    break;
                case 'w':
                    walkEast--;
                    break;
            }
        }
        return (walkNorth == 0) && (walkEast == 0);
    }
}
