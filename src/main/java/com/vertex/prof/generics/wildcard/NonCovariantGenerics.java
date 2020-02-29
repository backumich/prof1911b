package com.vertex.prof.generics.wildcard;


import com.vertex.prof.data.fruits.Apple;
import com.vertex.prof.data.fruits.Fruit;

import java.util.ArrayList;
import java.util.List;

public class NonCovariantGenerics {
    // Compile Error: incompatible types:
//    List<Fruit> flist = new ArrayList<Apple>();
}
