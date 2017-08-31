package com.ambow.corejava.day01;

/**
 * Created by Dw.L on 2017/7/10.
 *
 *练习3—1
 */
public class do_while {

    int i = 5;
    int n = 1;
    int product = 1;

    public void ride(){
        do {
            product = product*n;
            n++;
        } while (n<=5);

        System.out.println(product);
    }
}
