package org.codewars.kata;

import java.util.StringJoiner;
import java.util.stream.IntStream;

public class Address {
    public static String longToIP(long ip) {
        String bits = "0".repeat(32 - Long.toString(ip, 2).length()) + Long.toString(ip, 2);
        StringJoiner stringJoiner = new StringJoiner(".");
        IntStream.iterate(0, i -> i < 32, i -> i + 8).mapToObj(i -> bits.substring(i, i + 8)).toList().stream().map(s -> Integer.toString(Integer.parseInt(s, 2))).forEach(stringJoiner::add);
        return stringJoiner.toString();
    }
}
