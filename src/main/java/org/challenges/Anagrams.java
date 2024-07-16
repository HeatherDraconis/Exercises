package org.challenges;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input: ");
        String input = userInput.next();

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }

    public static char[] stringToArray(String input) {
        return input.toCharArray();
    }

    public static char[] stringToSortedArray(String input) {
        char[] inputArray = input.toCharArray();
        Arrays.sort(inputArray);
        return inputArray;
    }

    public static String sortStringUsingArray(String input) {
        char[] inputArray = input.toCharArray();
        Arrays.sort(inputArray);
        return String.valueOf(inputArray);
    }

    public static List<Character> stringToList(String input) {
        List<Character> inputList = new ArrayList<>();
        for (Character c : input.toCharArray()) {
            inputList.add(c);
        }
        return inputList;
    }

    public static List<Character> stringToSortedList(String input) {
        List<Character> inputList = stringToList( input );
        Collections.sort(inputList);
        return inputList;
    }

    public static String sortStringUsingList(String input) {
        List<Character> inputList = stringToList( input );
        Collections.sort(inputList);
        StringBuilder stringBuilder = new StringBuilder();
        for (Character c : inputList) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }

    public static Boolean ifAnagram(String input1, String input2) {
        if (input1.length() != input2.length()) {
            return Boolean.FALSE;
        }
        if (input1.equals(input2)) {
            return Boolean.TRUE;
        }
        return sortStringUsingArray(input1).equals(sortStringUsingArray(input2));
    }
}
