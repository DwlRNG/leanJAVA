package com.ambow.corejava.day03;

/**
 * Created by Dw.L on 2017/7/12. Time 19:15 PM
 *
 */
public class JavaBase03 {


    public static void main(String[] args) {

        System.out.println(JavaBase03.max(5,2));
        System.out.println(JavaBase03.max(10.5, 11.5));
        System.out.println(JavaBase03.max(5.5, 5.3, 5.4));

    }


    public static int max(int a,int b){

        if (a > b) {
            return a;
        }
        return b;
    }

    public static double max(double a, double b) {

        if (a > b) {
            return a;
        }
        return b;

    }

    public static double max(double a,double b,double c){

        if (a > b && a > c) {
            return a;
        } else if (b > c && b > a ) {
            return b;
        }
        return c;
    }


}
