package com.mtrading.Ceramic;

import org.junit.Test;

import java.awt.geom.Area;

public class Wall1 {
    private double width;
    private double height;

    public Wall1(double width, double height){
        this.width = width;
        this.height = height;

    }

    public double getArea() {
        return width * height;
    }
}
