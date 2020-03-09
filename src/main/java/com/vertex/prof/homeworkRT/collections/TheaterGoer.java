package com.vertex.prof.homeworkRT.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TheaterGoer {

    private String name;
    private Gender gender;
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
                LadiesComparator ladiesComparator = new LadiesComparator();
                Collections.sort(ladiesLine, ladiesComparator);
//                ladiesLine.sort(ladiesComparator);
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
                GentlemenComparator gentlemenComparator = new GentlemenComparator();
                Collections.sort(gentlemenLine, gentlemenComparator);
//                gentlemenLine.sort(gentlemenComparator);
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
