package com.ambow.corejava.day04.JavaBase10_1;

/**
 * Created by Dw.L on 2017/7/13.
 */
public class Circle extends Shape {

    double r;
    double pai = 3.14;

    public Circle( double r) {
        this.r = r;
    }

    @Override
    public double calculatePerimeter() {
        return 2*pai*r;
    }
}
