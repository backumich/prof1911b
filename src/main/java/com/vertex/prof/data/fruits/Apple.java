package com.vertex.prof.data.fruits;

import com.vertex.prof.data.fruits.Fruit;
import lombok.*;

import java.awt.Color;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Apple extends Fruit {
    private String sortName;
    private int weight;
    private int sweetness;
    private Color color;
}
