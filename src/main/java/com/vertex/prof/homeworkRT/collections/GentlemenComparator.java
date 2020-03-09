package com.vertex.prof.homeworkRT.collections;

import java.util.Comparator;

public class GentlemenComparator implements Comparator<TheaterGoer> {

    public int compare(TheaterGoer tg1, TheaterGoer tg2) {
        if (tg1.mustacheLength == tg2.mustacheLength) return 0;
        if (tg1.mustacheLength > tg2.mustacheLength) return -1;
        else return 1;
    }

}
