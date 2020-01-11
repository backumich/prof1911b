package com.vertex.prof.data.fruits;

import com.vertex.prof.data.fruits.Fruit;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.awt.Color;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
public class Apple extends Fruit {
    private String sortName;
    private int weight;
    private int sweetness;
    private Color color;
}
