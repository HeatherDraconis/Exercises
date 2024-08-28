package org.codewars.kata;

import java.util.Map;

public class PeteBaker {
    public static int cakes(Map<String, Integer> recipe, Map<String, Integer> available) {
        int cakes = -1;
        for (Map.Entry<String, Integer> entry : recipe.entrySet()) {
            String ingredient = entry.getKey();
            if (available.get(ingredient) == null) {
                return 0;
            }
            int cakesNew = available.get(ingredient) / entry.getValue();
            if (cakes == -1 || cakesNew < cakes) {
                cakes = cakesNew;
            }
        }
        return cakes;
    }
}
