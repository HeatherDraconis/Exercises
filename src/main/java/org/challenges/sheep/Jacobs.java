package org.challenges.sheep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jacobs implements Sheep {
    public List<Ply> getPlys() {
        Ply[] plys = new Ply[]{Ply.DK, Ply.Aran};
        List<Ply> myPlys = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);
        for (Ply ply: plys) {
            System.out.print(ply + ": ");
            String input = userInput.next();
            if(input.equals("y")){
                myPlys.add(ply);
            }
        }
        return myPlys;
    }
    public List<Colour> getColours(Ply ply) {
        Colour[] colours = new Colour[]{Colour.White, Colour.Grey, Colour.Black};
        List<Colour> myColours = new ArrayList<>();
        Scanner userInput = new Scanner(System.in);
        for (Colour colour: colours) {
            System.out.print(ply + " " + colour + ": ");
            String input = userInput.next();
            if(input.equals("y")){
                myColours.add(colour);
            }
        }
        return myColours;
    }
}

