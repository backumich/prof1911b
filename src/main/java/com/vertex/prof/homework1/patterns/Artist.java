package com.vertex.prof.homework1.patterns;

import java.util.ArrayList;


class Artist {

    private FiguresFactory factory = new FiguresFactory();
    private ArrayList<Figure> figureArrayList = new ArrayList<Figure>();

    Artist() {

        for (int i = 0; i < 25; i++) {
            figureArrayList.add(factory.getFigure(Figures.CIRCLE));
            figureArrayList.add(factory.getFigure(Figures.OVAL));
            figureArrayList.add(factory.getFigure(Figures.SQUARE));
            figureArrayList.add(factory.getFigure(Figures.RECTANGLE));
        }
    }

    int getSize() {
        return figureArrayList.size();
    }

    void paint(int numberOfFigures) {

        for (int i = 0; i < numberOfFigures; i++) {
            if (figureArrayList.size() != 0) {
                System.out.println(figureArrayList.get(0));
                figureArrayList.remove(0);
            } else {
                for (int j = 0; j < 25; j++) {
                    figureArrayList.add(factory.getFigure(Figures.CIRCLE));
                    figureArrayList.add(factory.getFigure(Figures.OVAL));
                    figureArrayList.add(factory.getFigure(Figures.SQUARE));
                    figureArrayList.add(factory.getFigure(Figures.RECTANGLE));
                };
            }
        }
    }
}

