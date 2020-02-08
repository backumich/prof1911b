package com.vertex.prof.homework1.patterns;

public class Circle implements Figure {

    protected int pointPlusX = 10;
    protected int pointPlusY = 15;
    private int radius = 5;

    Point point = new Point(100, 200);

    protected int positionX = pointPlusX + point.getValueX();
    protected int positionY = pointPlusY + point.getValueY();

    public static class CircleBuilder {
        private Circle newCircle;

        public CircleBuilder() { newCircle = new Circle(); }

        public CircleBuilder withPointPlusX(int pointPlusX) {
            newCircle.pointPlusX = pointPlusX;
            return this;
        }

        public CircleBuilder withPointPlusY(int pointPlusY) {
            newCircle.pointPlusY = pointPlusY;
            return this;
        }

        public CircleBuilder withRadius(int radius) {
            newCircle.radius = radius;
            return this;
        }

        public Circle build() {
            return newCircle;
        }
    }

    @Override
    public String toString() {
        return "Circle{ " +
                "Point ValueX = " + positionX +
                ", Point ValueY = " + positionY +
                ", Radius = " + radius +
                " }";
    }
}
