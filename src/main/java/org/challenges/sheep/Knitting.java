package org.challenges.sheep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Knitting {
    private static final List<Integer> needlesList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        while (true) {
            System.out.print("Needles: ");
            String input = userInput.next();
            boolean isNumber = input.matches("\\d+(\\.\\d+)?");
            if (!isNumber) {
                if(input.equals("n")){
                    break;
                }
                continue;
            }
            double needleSize = Double.parseDouble(input);
            needlesList.add((int) needleSize);
        }
        List<Wool> woolList = getWools();
        List<MyWool> myWoolList = MyJacobs.getMyWools();
    }

    private static List<Wool> getWools() {
        List<Wool> woolList = new ArrayList<>();
        for (Integer needleSize: needlesList) {
            for (Ply ply : Ply.values()) {
                var wool = new Wool(ply, needleSize);
                if (wool.isValid()) {
                    woolList.add(wool);
                } else {
                    System.out.println("Unsuitable!");
                }
            }
        }
        System.out.println(woolList);
        return woolList;
    }
}
