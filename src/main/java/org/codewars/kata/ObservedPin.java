package org.codewars.kata;

import java.util.ArrayList;
import java.util.List;

public class ObservedPin {
    public static List<String> getPINs(String observed) {
        List<String> trials = new ArrayList<>();
        trials.add(observed);
        for (int i = 0; i < observed.length(); i++) {
            int size = trials.size();
            for (int j = 0; j < size; j++) {
                String startString = trials.get(j).substring(0, i);
                String endString = trials.get(j).substring(i + 1);
                switch (observed.charAt(i)) {
                    case '0' -> {
                        trials.add(startString + '8' + endString);
                    }
                    case '1' -> {
                        trials.add(startString + '2' + endString);
                        trials.add(startString + '4' + endString);
                    }
                    case '2' -> {
                        trials.add(startString + '1' + endString);
                        trials.add(startString + '3' + endString);
                        trials.add(startString + '5' + endString);
                    }
                    case '3' -> {
                        trials.add(startString + '2' + endString);
                        trials.add(startString + '6' + endString);
                    }
                    case '4' -> {
                        trials.add(startString + '1' + endString);
                        trials.add(startString + '5' + endString);
                        trials.add(startString + '7' + endString);
                    }
                    case '5' -> {
                        trials.add(startString + '2' + endString);
                        trials.add(startString + '4' + endString);
                        trials.add(startString + '6' + endString);
                        trials.add(startString + '8' + endString);
                    }
                    case '6' -> {
                        trials.add(startString + '3' + endString);
                        trials.add(startString + '5' + endString);
                        trials.add(startString + '9' + endString);
                    }
                    case '7' -> {
                        trials.add(startString + '4' + endString);
                        trials.add(startString + '8' + endString);
                    }
                    case '8' -> {
                        trials.add(startString + '0' + endString);
                        trials.add(startString + '5' + endString);
                        trials.add(startString + '7' + endString);
                        trials.add(startString + '9' + endString);
                    }
                    case '9' -> {
                        trials.add(startString + '6' + endString);
                        trials.add(startString + '8' + endString);
                    }
                    default -> throw new IllegalStateException("Unexpected value:" + observed.charAt(i));
                }
            }
        }
        return trials;
    }
}
