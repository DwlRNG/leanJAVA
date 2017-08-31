package com.ambow.corejava.day04.JavaBase10_2;

/**
 * Created by Dw.L on 2017/7/13.
 */
public class Odd implements OddInterface {

    int odd;

    public Odd(int odd) {
        this.odd = odd;
    }

    @Override
    public boolean isOddNumber() {

        if (odd % 2 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public double getOdd() {
        return odd;
    }
}
