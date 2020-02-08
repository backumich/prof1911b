package com.vertex.prof.homework1.patterns;

public class FiguresFactory {

    public Figure getFigure (Figures figure) {
        switch (figure){
            case CIRCLE:
                return new Circle();
            case OVAL:
                return new Oval();
            case SQUARE:
                return new Square();
            case RECTANGLE:
                return new Rectangle();
            default:
                    throw new IllegalArgumentException("Wrong figure " + figure);
        }
    }
}
