package org.codewars.kata;

public class Runes {
    public static int solveExpression(String expression) {
        String[] expressionArray = expression.split("=");
        String equationString = expressionArray[0]
                .indent(1)
                .replaceAll(" -", "d")
                .replaceAll("\\+-", "a")
                .replaceAll("--", "b")
                .replaceAll("-", "a")
                .replaceAll("\\+", "b")
                .replaceAll("\\*", "c")
                .replaceAll("ca", " * -")
                .replaceAll("a", " + -")
                .replaceAll("b", " + ")
                .replaceAll("c", " * ")
                .replaceAll("d", "-")
                .trim();
        String resultString = expressionArray[1];
        for (int missingDigit = 0; missingDigit < 10; missingDigit++) {
            if (expression.contains(missingDigit + "")) {
                continue;
            }
            String newResultString = replaceQu(resultString, missingDigit);
            if (isInvalidNumber(newResultString)) {
                continue;
            }
            int result = Integer.parseInt(newResultString);
            String newEquationString = replaceQu(equationString, missingDigit);
            int equation = getEquation(newEquationString);
            if (equation == result) {
                return missingDigit;
            }
        }
        return -1;
    }

    private static String replaceQu(String expression, int missingDigit) {
        return expression.replaceAll("\\?", missingDigit + "");
    }

    private static int getEquation(String equationString) {
        String[] equationArray = equationString.split("\\s+");
        int term1 =  Integer.parseInt(equationArray[0]);
        if (isInvalidNumber(equationArray[0])) {
            return Integer.MAX_VALUE;
        }
        String operator = equationArray[1];
        int term2 =  Integer.parseInt(equationArray[2]);
        if (isInvalidNumber(equationArray[2])) {
            return Integer.MAX_VALUE;
        }
        switch (operator) {
            case "+" -> {
                return term1 + term2;
            }
            case "*" -> {
                return term1 * term2;
            }
            default -> {
                return Integer.MAX_VALUE;
            }
        }
    }

    private static boolean isInvalidNumber(String s) {
        return s.startsWith("0") && !s.equals("0") || s.startsWith("-0") && !s.equals("-0");
    }
}
