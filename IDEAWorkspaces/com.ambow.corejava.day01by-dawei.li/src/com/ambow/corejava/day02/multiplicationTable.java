package com.ambow.corejava.day02;

/**
 * Created by Dw.L on 2017/7/11.
 */
public class multiplicationTable {

    public void demo(){

        for (int i=1;i<=9;i++) {
            for (int t=1;t<=i;t++){

                System.out.print(i+" * "+t+" = "+i*t+"  ");

            }
            System.out.println();

        }

    }
}
