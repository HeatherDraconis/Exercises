package org.codewars.kata;

import java.util.ArrayList;
import java.util.List;

public class PigLatin {
    public static String pigIt(String str) {
        List<String> strList = new ArrayList<>();
        for (String s : str.split(" ", -1)) {
            if (!s.isEmpty() && ((s.charAt(0) >= 'a' && s.charAt(0) <= 'z') || (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z'))) {
                strList.add(s.substring(1) + s.charAt(0) + "ay");
            }
            else {
                strList.add(s);
            }
        }
        return String.join(" ", strList);
    }
}
