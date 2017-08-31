package com.ambow.corejava.day04.JavaBase10_1;

import org.junit.Test;

/**
 * Created by Dw.L on 2017/7/13.
 */
public class ShapeTest {


    @Test
    public void ShapeTest(){

        Circle circle = new Circle(5);
        System.out.println(circle.calculatePerimeter());

    }

    @Test
    public void Rectangle(){

        Rectangle rectangle = new Rectangle(11.1,5.8);

        System.out.println(rectangle.calculatePerimeter());

    }
}
