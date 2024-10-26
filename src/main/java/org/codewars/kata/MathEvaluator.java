package org.codewars.kata;

public class MathEvaluator {
    public  double calculate(String expression) {
        if (expression.matches("[ ()/*+-]*")) {
            return 0;
        }
        StringBuilder stringBuilder = new StringBuilder(expression.replaceAll("\\s", "").replaceAll("--", "+").replaceAll("\\+-", "-"));
        getBrackets(stringBuilder);
        stringBuilder = getStringBuilder(stringBuilder);
        getDivision(stringBuilder);
        stringBuilder = getStringBuilder(stringBuilder);
        getMultiplication(stringBuilder);
        stringBuilder = getStringBuilder(stringBuilder);
        while (stringBuilder.toString().contains("+") || stringBuilder.substring(1).contains("-")) {
            getAddition(stringBuilder);
            stringBuilder = getStringBuilder(stringBuilder);
            getSubtraction(stringBuilder);
            stringBuilder = getStringBuilder(stringBuilder);
        }
        return Double.parseDouble(stringBuilder.toString());
    }

    private static StringBuilder getStringBuilder(StringBuilder stringBuilder) {
        stringBuilder = new StringBuilder(stringBuilder.toString().replaceAll("--", "+").replaceAll("\\+-", "-").replaceAll("/\\+", "/").replaceAll("\\*\\+", "*"));
        return stringBuilder;
    }

    private static void getSubtraction(StringBuilder stringBuilder) {
        while (stringBuilder.substring(1).contains("-")) {
            int indexMulti = stringBuilder.indexOf("-", 1);
            int i = 1;
            while (indexMulti - i >= 0 && (stringBuilder.substring(indexMulti - i, indexMulti + 1 - i).matches("[0-9]") || stringBuilder.substring(indexMulti - i, indexMulti + 1 - i).matches("[.]"))) {
                i++;
            }
            if (indexMulti - i < 0 || !stringBuilder.substring(indexMulti - i, indexMulti - i + 1).equals("-")) {
                i--;
            }
            double before = Double.parseDouble(stringBuilder.substring(indexMulti - i, indexMulti));

            int j = 1;
            while ((indexMulti + j < stringBuilder.length() && (stringBuilder.substring(indexMulti + j, indexMulti + j + 1).matches("[0-9]") || stringBuilder.substring(indexMulti + j, indexMulti + j + 1).matches("[.]")))) {
                j++;
            }
            double after;
            if (indexMulti + j == stringBuilder.length()) {
                after = Double.parseDouble(stringBuilder.substring(indexMulti + 1));
            }
            else {
                after = Double.parseDouble(stringBuilder.substring(indexMulti + 1, indexMulti + j));
            }
            stringBuilder.delete(indexMulti - i, indexMulti + j).insert(indexMulti - i, before - after);
        }
    }

    private static void getAddition(StringBuilder stringBuilder) {
        while (stringBuilder.toString().contains("+")) {
            int indexMulti = stringBuilder.indexOf("+");
            if (indexMulti == 0) {
                stringBuilder.delete(0, 1);
                break;
            }
            int i = 1;
            while (indexMulti - i >= 0 && (stringBuilder.substring(indexMulti - i, indexMulti + 1 - i).matches("[0-9]") || stringBuilder.substring(indexMulti - i, indexMulti + 1 - i).matches("[.]"))) {
                i++;
            }
            if (indexMulti - i < 0 || !stringBuilder.substring(indexMulti - i, indexMulti - i + 1).equals("-")) {
                i--;
            }
            double before = Double.parseDouble(stringBuilder.substring(indexMulti - i, indexMulti));

            int j = 1;
            while ((indexMulti + j < stringBuilder.length() && (stringBuilder.substring(indexMulti + j, indexMulti + j + 1).matches("[0-9]") || stringBuilder.substring(indexMulti + j, indexMulti + j + 1).matches("[.]")))) {
                j++;
            }
            double after;
            if (indexMulti + j == stringBuilder.length()) {
                after = Double.parseDouble(stringBuilder.substring(indexMulti + 1));
            }
            else {
                after = Double.parseDouble(stringBuilder.substring(indexMulti + 1, indexMulti + j));
            }
            stringBuilder.delete(indexMulti - i, indexMulti + j).insert(indexMulti - i, indexMulti -i > 0 && !stringBuilder.substring(indexMulti - i - 1, indexMulti - i).matches("[(/*+-]") ? "+" + (before + after) : String.valueOf(before + after));
        }
    }

    private static void getMultiplication(StringBuilder stringBuilder) {
        while (stringBuilder.toString().contains("*")) {
            int indexMulti = stringBuilder.indexOf("*");
            int i = 1;
            while (indexMulti - i >= 0 && (stringBuilder.substring(indexMulti - i, indexMulti + 1 - i).matches("[0-9]") || stringBuilder.substring(indexMulti - i, indexMulti + 1 - i).matches("[.]"))) {
                i++;
            }
            i--;
            double before = Double.parseDouble(stringBuilder.substring(indexMulti - i, indexMulti));

            int j = 1;
            while ((indexMulti + j < stringBuilder.length() && (stringBuilder.substring(indexMulti + j, indexMulti + j + 1).matches("[0-9]") || stringBuilder.substring(indexMulti + j, indexMulti + j + 1).matches("[.]"))) || (j == 1 && stringBuilder.substring(indexMulti + 1, indexMulti + 2).matches("-"))) {
                j++;
            }
            double after;
            if (indexMulti + j == stringBuilder.length() - 1) {
                after = Double.parseDouble(stringBuilder.substring(indexMulti + 1));
            }
            else {
                after = Double.parseDouble(stringBuilder.substring(indexMulti + 1, indexMulti + j));
            }
            stringBuilder.delete(indexMulti - i, indexMulti + j).insert(indexMulti - i, indexMulti - i > 0 && !stringBuilder.substring(indexMulti - i - 1, indexMulti - i).matches("[(/*+-]") ? "+" + (before * after) : String.valueOf(before * after));
        }
    }

    private static void getDivision(StringBuilder stringBuilder) {
        while (stringBuilder.toString().contains("/")) {
            int indexMulti = stringBuilder.indexOf("/");
            int i = 1;
            while (indexMulti - i >= 0 && (stringBuilder.substring(indexMulti - i, indexMulti + 1 - i).matches("[0-9]") || stringBuilder.substring(indexMulti - i, indexMulti + 1 - i).matches("[.]"))) {
                i++;
            }
            i--;
            double before = Double.parseDouble(stringBuilder.substring(indexMulti - i, indexMulti));

            int j = 1;
            while ((indexMulti + j < stringBuilder.length() && (stringBuilder.substring(indexMulti + j, indexMulti + j + 1).matches("[0-9]") || stringBuilder.substring(indexMulti + j, indexMulti + j + 1).matches("[.]"))) || (j == 1 && stringBuilder.substring(indexMulti + 1, indexMulti + 2).matches("-"))) {
                j++;
            }
            double after;
            if (indexMulti + j == stringBuilder.length()) {
                after = Double.parseDouble(stringBuilder.substring(indexMulti + 1));
            }
            else {
                after = Double.parseDouble(stringBuilder.substring(indexMulti + 1, indexMulti + j));
            }
            stringBuilder.delete(indexMulti - i, indexMulti + j).insert(indexMulti - i, indexMulti - i > 0 && !stringBuilder.substring(indexMulti - i - 1, indexMulti - i).matches("[(/*+-]") ? "+" + (before / after) : String.valueOf(before / after));
       }
    }

    private void getBrackets(StringBuilder stringBuilder) {
        while (stringBuilder.toString().contains("(")) {
            int indexClose = -1;
            int indexOpen = stringBuilder.indexOf("(");
            int open = indexOpen;
            int closed = 0;
            do {
                open = stringBuilder.indexOf("(", open + 1);
                closed = stringBuilder.indexOf(")", closed + 1);
                if (closed < open || open == -1) {
                    indexClose = closed;
                }
            } while (indexClose == -1);
            double bracket = calculate(stringBuilder.substring(indexOpen + 1, indexClose));
            stringBuilder.delete(indexOpen, indexClose + 1).insert(indexOpen, bracket);
        }
    }
}
