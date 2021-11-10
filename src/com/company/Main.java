package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> colours = new ArrayList<>();
        int score = 0;
        int cont = 0;

        colours.add("red");
        colours.add("green");
        colours.add("blue");
        colours.add("yellow");
        colours.add("purple");
        colours.add("cyan");
        colours.add("white");
        colours.add("black");
        colours.add("grey");
        colours.add("orange");
        colours.add("magenta");
        colours.add("crimson");
        colours.add("emerald");

        for (int i = 0; i < 9; i++) {

            System.out.println("here are the colours to pick from, they will be randomised " + colours);

            Collections.shuffle(colours);

            String answer = colours.get(5);
            System.out.println("guess the next colour");
            String guess = input.next();

            if (guess.equals(answer)) {
                System.out.println("correct");
                score = score + 1;
                System.out.println("your score is " + score);
            } else {
                System.out.println("incorrect. the answer was " + answer);
            }
            colours.remove(0);

        }
    }
}
