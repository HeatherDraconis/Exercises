package org.codewars.kata;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Camel2 {
    static String toCamelCase(String s){
        String[] sArray = s.split("[-_]");
        return IntStream.range(1, sArray.length)
                .mapToObj(i -> sArray[i].substring(0, 1).toUpperCase() + sArray[i].substring(1))
                .collect(Collectors.joining("", sArray[0], ""));
    }
}
