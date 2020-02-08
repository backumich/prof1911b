package com.vertex.prof.homework1.patterns;

public final class Point {
    private int valueX;
    private int valueY;

    public Point(int valueX, int valueY) {
        this.valueX = valueX;
        this.valueY = valueY;
    }

    public Point setValueX(int valueX) {
        this.valueX = valueX;
        Point p = new Point(valueX, this.valueY);
        return p;
    }

    public Point setValueY(int valueY) {
        this.valueY = valueY;
        Point p = new Point(this.valueX, valueY);
        return p;
    }


    public int getValueX() {
        return valueX;
    }

    public int getValueY() {
        return valueY;
    }

    @Override
    public String toString() {
        return "Point{" +
                "valueX=" + valueX +
                ", valueY=" + valueY +
                '}';
    }
}
