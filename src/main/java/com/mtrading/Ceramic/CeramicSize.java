package com.mtrading.Ceramic;

public class CeramicSize {

    private double width;
    private double height;

    public CeramicSize (double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return height * width;
    }
}
