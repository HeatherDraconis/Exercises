package org.codewars.kata;

public class Chess {
    public static int knight(String start, String  finish) {
        int numFinish = Character.getNumericValue(finish.charAt(0));
        int letterFinish = Character.getNumericValue(finish.charAt(1));
        int letterDifference = Character.getNumericValue(start.charAt(0)) - numFinish;
        int numDifference = Character.getNumericValue(start.charAt(1)) - letterFinish;
        int letterLimitLow = - (numFinish - 10);
        int letterLimitHigh = 7 - (numFinish - 10);
        int numLimitLow = 1 - letterFinish;
        int numLimitHigh = 8 - letterFinish;

        int count = 0;
        boolean letterHasOdd = false;
        boolean numHasOdd = false;

        while (letterDifference != 0 || numDifference != 0) {
            count++;
            if (Math.abs(letterDifference) == 1 && numDifference == 0 && numHasOdd) {
                numDifference = 2;
            }
            if (Math.abs(numDifference) == 1 && letterDifference == 0 && letterHasOdd) {
                letterDifference = 2;
            }
            boolean notLetterIsTwoAndNumIsZero = !(Math.abs(letterDifference) == 2 && numDifference == 0);
            boolean letterEqualNumWithMoreSpace = letterDifference == numDifference
                    && (letterDifference > 0 && letterLimitHigh < numLimitHigh || letterDifference < 0 && letterLimitLow > numLimitLow);
            boolean letterInverseNumWithMoreSpace = letterDifference == -numDifference
                    && (letterDifference > 0 && letterLimitHigh < -numLimitLow || letterDifference < 0 && letterLimitLow > -numLimitHigh);
            boolean letterGreaterAndEven = Math.abs(letterDifference) > Math.abs(numDifference) && letterDifference % 2 == 0;
            boolean numGreaterAndNotEven = Math.abs(letterDifference) < Math.abs(numDifference) && numDifference % 2 != 0;
            boolean letterLimitsAllowed = letterDifference == 0
                    || letterDifference > 0 && letterDifference - 2 >= letterLimitLow
                    || letterDifference < 0 && letterDifference + 2 <= letterLimitHigh;
            boolean numLimitsNotAllowed = numDifference > 0 && numDifference - 2 < numLimitLow
                    || numDifference < 0 && numDifference + 2 > numLimitHigh;
            boolean NumIsTwoAndLetterIsZero = Math.abs(numDifference) == 2 && letterDifference == 0;
            if (notLetterIsTwoAndNumIsZero && (
                    (letterEqualNumWithMoreSpace || letterInverseNumWithMoreSpace || letterGreaterAndEven || numGreaterAndNotEven)
                            && letterLimitsAllowed || numLimitsNotAllowed) || NumIsTwoAndLetterIsZero) {
                if ((letterDifference > 0 && letterDifference - 2 >= letterLimitLow)
                        || (letterDifference < 0 && letterDifference + 2 > letterLimitHigh)) {
                    letterDifference -= 2;
                } else {
                    letterDifference += 2;
                }
                if ((numDifference <= 0 && -2 >= numLimitLow)
                        || (numDifference >= 0 && 2 <= numLimitHigh)) {
                    numHasOdd = true;
                }
                if (numDifference > 0 || numDifference + 1 > numLimitHigh) {
                    numDifference -= 1;
                } else {
                    numDifference += 1;
                }
            } else {
                if ((letterDifference <= 0 && letterLimitLow <= -2)
                        || (letterDifference >= 0 && letterLimitHigh >= 2)) {
                    letterHasOdd = true;
                }
                if (letterDifference > 0 || letterDifference + 1 > numLimitHigh) {
                    letterDifference -= 1;
                } else {
                    letterDifference += 1;
                }
                if ((numDifference > 0 && numDifference - 2 >= numLimitLow)
                        || (numDifference < 0 && numDifference + 2 > numLimitHigh)) {
                    numDifference -= 2;
                } else {
                    numDifference += 2;
                }
            }
            if (Math.abs(letterDifference) == Math.abs(numDifference) && (letterHasOdd || numHasOdd)) {
                letterHasOdd = true;
                numHasOdd = true;
            }
        }
        return count;
    }
}
