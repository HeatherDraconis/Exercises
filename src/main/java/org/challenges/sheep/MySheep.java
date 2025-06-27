package org.challenges.sheep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public abstract class MySheep {
    protected static Short sheepNumber = null;
    public static void setSheepNumber(String sheep) {
        Scanner userInput = new Scanner(System.in);
        String input;
        do {
            System.out.print("Number of " + sheep + " Sheep: ");
            input = userInput.next();
        } while (!input.matches("\\d+"));
        sheepNumber = Short.parseShort(input);
    }

    public static List<MyWool> getWools(Sheep sheep) {
        List<Ply> plys = sheep.getPlys();
        List<MyWool> myWoolList = new ArrayList<>();
        for (Ply ply : plys) {
            List<Colour> colours = sheep.getColours(ply);
            for (Colour colour : colours) {
                var myWool = new MyWool(ply, colour, sheepNumber);
                myWoolList.add(myWool);
            }
        }
        System.out.println(myWoolList);
        return myWoolList;
    }
}
