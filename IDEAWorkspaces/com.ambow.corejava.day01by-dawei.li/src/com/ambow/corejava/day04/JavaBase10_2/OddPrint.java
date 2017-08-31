package com.ambow.corejava.day04.JavaBase10_2;

/**
 * Created by Dw.L on 2017/7/13.
 */
public class OddPrint {

    public  static void print(OddInterface oddInterface){

        if (oddInterface.isOddNumber()){
            System.out.println("是偶数");
        }else {
            System.out.println("是奇数");
        }

        System.out.println("你输入的是："+ oddInterface.getOdd());
    }


}
