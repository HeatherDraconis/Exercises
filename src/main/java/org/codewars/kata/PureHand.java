package org.codewars.kata;

public class PureHand {
    public static String solution(String tiles) {
        int[] tilesArray = {0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (String str : tiles.split("")) {
            tilesArray[Integer.parseInt(str) - 1]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < 10; i++) {
            String string = tilesArray[i - 1] < 4 ? trialValue(tilesArray, i) : "";
            sb.append(string);
        }
        return sb.toString();
    }

    private static String trialValue(int[] tilesArrayOld, int value) {
        int[] tilesArray = tilesArrayOld.clone();
        tilesArray[value - 1]++;
        return getSameMeld(tilesArray,false, 0, 1) || getSeriesMeld(tilesArray,false, 0, 1) || getPair(tilesArray, 0, 1) ? value + "" : "";
    }

    private static boolean getSameMeld(int[] tilesArrayOld, boolean hasPair, int meldsOld, int tile) {
        int[] tilesArray = tilesArrayOld.clone();
        while (tile < 10 && tilesArray[tile - 1] == 0) {
            tile++;
        }
        if (tile == 10 || tilesArray[tile - 1] < 3) {
            return false;
        }
        tilesArray[tile - 1] -= 3;
        int melds = meldsOld + 1;
        if (melds == 4 && hasPair) {
            return true;
        }
        if (hasPair) {
            return getSameMeld(tilesArray, true, melds, tile) || getSeriesMeld(tilesArray, true, melds, tile);
        }
        if (melds == 4) {
            return getPair(tilesArray, melds, tile);
        }
        return getSameMeld(tilesArray, false, melds, tile) || getSeriesMeld(tilesArray, false, melds, tile) || getPair(tilesArray, melds, tile);
    }

    private static boolean getSeriesMeld(int[] tilesArrayOld, boolean hasPair, int meldsOld, int tile) {
        int[] tilesArray = tilesArrayOld.clone();
        while (tile < 8 && tilesArray[tile - 1] == 0) {
            tile++;
        }
        if (tile >= 8 || tilesArray[tile] == 0 || tilesArray[tile + 1] == 0) {
            return false;
        }
        tilesArray[tile - 1]--;
        tilesArray[tile]--;
        tilesArray[tile + 1]--;
        int melds = meldsOld + 1;
        if (melds == 4 && hasPair) {
            return true;
        }
        if (hasPair) {
            return getSameMeld(tilesArray, true, melds, tile) || getSeriesMeld(tilesArray, true, melds, tile);
        }
        if (melds == 4) {
            return getPair(tilesArray, melds, tile);
        }
        return getSameMeld(tilesArray, false, melds, tile) || getSeriesMeld(tilesArray, false, melds, tile) || getPair(tilesArray, melds, tile);
    }

    private static boolean getPair(int[] tilesArrayOld, int melds, int tile) {
        int[] tilesArray = tilesArrayOld.clone();
        while (tile < 10 && tilesArray[tile - 1] == 0) {
            tile++;
        }
        if (tile == 10 || tilesArray[tile - 1] < 2) {
            return false;
        }
        tilesArray[tile - 1] -= 2;
        if (melds == 4) {
            return true;
        }
        return getSameMeld(tilesArray, true, melds, tile) || getSeriesMeld(tilesArray, true, melds, tile);
    }
}
