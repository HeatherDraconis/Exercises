package org.codewars.kata;

public class Incrementer {
    public static String incrementString(String str) {
        int i = str.length() - 1;
        if (i >= 0 && str.substring(i).matches("\\d")) {
            while (i > 0 && str.substring(i - 1).length() <= 18 && str.substring(i - 1).matches("\\d.*")) {
                i--;
            }
            return str.substring(0, i) + addOne(str.substring(i));
        }
        return str + "1";
    }

    private static String addOne(String strNum) {
        long num = Long.parseLong(strNum);
        num++;
        String strNumNew = String.valueOf(num);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(strNumNew);
        while (strNumNew.length() < strNum.length()) {
            strNumNew = stringBuilder.insert(0, "0").toString();
        }
        return strNumNew;
    }
}
