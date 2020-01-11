package com.vertex.prof.comparator;

import com.vertex.prof.data.fruits.Apple;

import java.util.Comparator;

public class AppleComparator implements Comparator<Apple> {

    public int compare(Apple left, Apple right) {
        return left.getWeight() != right.getWeight() ?
                Integer.compare(left.getWeight(), right.getWeight()) :
                Integer.compare(left.getSweetness(), right.getSweetness());
    }
}
