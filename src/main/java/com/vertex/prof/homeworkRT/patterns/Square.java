package com.vertex.prof.homeworkRT.patterns;

public class Square implements Figure {

    protected int pointPlusX = 70;
    protected int pointPlusY = 13;
    private int side = 40;

    Point point = new Point(700, 900);

    protected int positionX = pointPlusX + point.getValueX();
    protected int positionY = pointPlusY + point.getValueY();

    public static class SquareBuilder {
        private Square newSquare;

        public SquareBuilder() { newSquare = new Square(); }

        public SquareBuilder withPointPlusX(int pointPlusX) {
            newSquare.pointPlusX = pointPlusX;
            return this;
        }

        public SquareBuilder withPointPlusY(int pointPlusY) {
            newSquare.pointPlusY = pointPlusY;
            return this;
        }

        public SquareBuilder withSide(int side) {
            newSquare.side = side;
            return this;
        }

        public Square build() {
            return newSquare;
        }
    }

    @Override
    public String toString() {
        return "Square{ " +
                "Point ValueX = " + positionX +
                ", Point ValueY = " + positionY +
                ", Side = " + side +
                " }";
    }
}
