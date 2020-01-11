package com.vertex.prof.comparator;

import com.vertex.prof.data.fruits.Apple;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Apple jonathan = Apple.builder()
                .sortName("Jonathan")
                .weight(200)
                .sweetness(10)
                .build();
        Apple golden = Apple.builder()
                .sortName("Golden")
                .weight(180)
                .sweetness(15)
                .build();

        Apple idaRed = Apple.builder()
                .sortName("Ida red")
                .weight(200)
                .sweetness(13)
                .build();

        Apple[] apples = {jonathan, golden, idaRed};
        System.out.println(Arrays.toString(apples));
//        System.out.println(apples);

        Arrays.sort(apples, new AppleComparator());
        System.out.println(Arrays.toString(apples));

        Arrays.sort(apples, Comparator.comparingInt(Apple::getWeight)
                .thenComparingInt(Apple::getSweetness)
                .reversed());
        System.out.println(Arrays.toString(apples));
    }
}
