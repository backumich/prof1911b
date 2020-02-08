package com.vertex.prof.homework1.patterns;

public class Rectangle extends Square implements Figure {

    private int sideX = 89;
    private int sideY = 96;

    public static class RectangleBuilder {
        private Rectangle newRectangle;

        public RectangleBuilder() { newRectangle = new Rectangle(); }

        public RectangleBuilder withPointPlusX(int pointPlusX) {
            newRectangle.pointPlusX = pointPlusX;
            return this;
        }

        public RectangleBuilder withPointPlusY(int pointPlusY) {
            newRectangle.pointPlusY = pointPlusY;
            return this;
        }

        public RectangleBuilder withSideX(int sideX) {
            newRectangle.sideX = sideX;
            return this;
        }

        public RectangleBuilder withSideY(int sideY) {
            newRectangle.sideX = sideY;
            return this;
        }

        public Rectangle build() {
            return newRectangle;
        }
    }

    @Override
    public String toString() {
        return "Rectangle{ " +
                "Point ValueX = " + positionX +
                ", Point ValueY = " + positionY +
                ", SideX = " + sideX +
                ", SideY = " + sideY +
                " }";
    }

}
