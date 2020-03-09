package com.vertex.prof.homeworkRT.collections;

import java.util.Comparator;

public class LadiesComparator implements Comparator<TheaterGoer> {
    public int compare(TheaterGoer tg1, TheaterGoer tg2) {
        if (tg1.numberOfBrooches == tg2.numberOfBrooches) return 0;
        if (tg1.numberOfBrooches > tg2.numberOfBrooches) return -1;
        else return 1;
    }
}

