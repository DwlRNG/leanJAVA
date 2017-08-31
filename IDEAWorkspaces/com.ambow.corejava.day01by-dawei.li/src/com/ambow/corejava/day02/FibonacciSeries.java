package com.ambow.corejava.day02;

/**
 * Created by Dw.L on 2017/7/11.
 */
public class FibonacciSeries {

    public void demo(){
        int i = 1;
        while (calFib(i) <= 100) {

            System.out.println(calFib(i));
            i++;
        }
    }
    public static Integer calFib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else if (n >= 3) {
            return calFib(n - 1) + calFib(n - 2);
        }
        return 0;

    }
}
