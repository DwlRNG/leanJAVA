package com.ambow.corejava.day04.JavaBase10_1;

/**
 * Created by Dw.L on 2017/7/13.
 */
public class Rectangle extends Shape{


    double l;
    double w;

    public Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    @Override
    public double calculatePerimeter() {
        return 2*l+2*w;
    }



}
