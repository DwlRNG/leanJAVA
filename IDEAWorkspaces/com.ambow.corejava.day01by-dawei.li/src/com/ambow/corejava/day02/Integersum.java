package com.ambow.corejava.day02;

/**
 * Created by Dw.L on 2017/7/11.
 */
public class Integersum {

    int i=0;

    int sum=0;

    public void sum(){

        for (;i<=100;i++){
            sum = sum+i;
        }
        System.out.println("1+......+100 = "+sum);
    }
}
