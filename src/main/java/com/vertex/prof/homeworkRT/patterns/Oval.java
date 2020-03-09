package com.vertex.prof.homeworkRT.patterns;

public class Oval extends Circle implements Figure {


    private int radiusX = 5;
    private int radiusY = 10;

    public static class OvalBuilder {
        private Oval newOval;

        public OvalBuilder (){
            newOval = new Oval();
        }

        public OvalBuilder withPointPlusX (int pointPlusX){
            newOval.pointPlusX = pointPlusX;
            return this;
        }

        public OvalBuilder withPointPlusY (int pointPlusY){
            newOval.pointPlusY = pointPlusY;
            return this;
        }

        public OvalBuilder withRadiusX (int radiusX){
            newOval.radiusX = radiusX;
            return this;
        }

        public OvalBuilder withRadiusY (int radiusY){
            newOval.radiusY = radiusY;
            return this;
        }

        public Oval build(){
            return newOval;
        }
    }

    @Override
    public String toString() {
        return "Oval{ " +
                "Point ValueX = " + positionX +
                ", Point ValueY = " + positionY +
                ", Radius X = " + radiusX +
                ", Radius Y = " + radiusY +
                " }";
    }
}
