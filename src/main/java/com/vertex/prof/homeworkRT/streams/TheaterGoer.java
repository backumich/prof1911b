package com.vertex.prof.homeworkRT.streams;

import java.util.ArrayList;
import java.util.List;

public class TheaterGoer {

    private String name;
    public Gender gender;
    public int numberOfBrooches;
    private boolean priorityInLine;
    public int mustacheLength;

    static List<TheaterGoer> ladiesLine = new ArrayList<TheaterGoer>();
    static List<TheaterGoer> gentlemenLine = new ArrayList<TheaterGoer>();

    TheaterGoer(String name, Gender gender, boolean priorityInLine, int numberOfBrooches) {
        try {
            this.name = name;
            this.gender = gender;
            this.priorityInLine = priorityInLine;
            this.numberOfBrooches = numberOfBrooches;

            if (this.gender == Gender.GENTLEMAN) {
                throw new RuntimeException();
            } else {
                System.out.println("Hello! My name is " + name + ", and I am a Lady.");
                ladiesLine.add((this));
//                Collections.sort(ladiesLine, (o1, o2) -> o2.numberOfBrooches - o1.numberOfBrooches);
            ladiesLine.sort((o1, o2) -> o2.numberOfBrooches - o1.numberOfBrooches);
            }
        } catch (RuntimeException e) {
            System.out.println("Excuse me! I'm not a Gentleman! I am a Lady!");
        }
    }

    TheaterGoer(String name, Gender gender, int mustacheLength) {
        try {
            this.name = name;
            this.gender = gender;
            this.mustacheLength = mustacheLength;

            if (this.gender == Gender.LADY) {
                throw new RuntimeException();
            } else {
                System.out.println("Hello! My name is " + name + ", and I am a Gentleman.");
                gentlemenLine.add((this));
//                Collections.sort(gentlemenLine, ((o1, o2) -> o2.mustacheLength - o1.mustacheLength));
            gentlemenLine.sort((o1, o2) -> o2.mustacheLength - o1.mustacheLength);
            }
        } catch (RuntimeException e) {
            System.out.println("How dare you! I'm not a Lady! I am a Gentleman!");
        }

    }


    @Override
    public String toString() {
        return "TheaterGoer{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", numberOfBrooches=" + numberOfBrooches +
                ", mustacheLength=" + mustacheLength +
                '}';
    }


}
