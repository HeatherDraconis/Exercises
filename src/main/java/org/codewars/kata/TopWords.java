package org.codewars.kata;

import java.util.*;

public class TopWords {
    public static List<String> top3(String text) {
        text = text.toLowerCase();
        List<String> wordsList = new ArrayList<>();
        Map<String, Integer> wordsMap = new HashMap<>();
        String[] textArray = text.replaceAll("[^a-z']", " ")
                .split("\\s");
        for (String str : textArray) {
            if (!str.isBlank() && !str.matches("'+")) {
                if (wordsMap.putIfAbsent(str, 1) != null) {
                    wordsMap.put(str, wordsMap.get(str) + 1);
                }
                wordsList.remove(str);
                if (wordsList.isEmpty()) {
                    wordsList.add(str);
                } else if (wordsMap.get(str) > wordsMap.get(wordsList.get(0))) {
                    wordsList.addFirst(str);
                } else if (wordsList.size() == 1) {
                    wordsList.add(str);
                } else if (wordsMap.get(str) > wordsMap.get(wordsList.get(1))) {
                    wordsList.add(1, str);
                } else if (wordsList.size() == 2) {
                    wordsList.add(str);
                } else if (wordsMap.get(str) > wordsMap.get(wordsList.get(2))) {
                    wordsList.add(2, str);
                }
                if (wordsList.size() > 3) {
                    wordsList.remove(3);
                }
            }
        }
        return wordsList;
    }
}
