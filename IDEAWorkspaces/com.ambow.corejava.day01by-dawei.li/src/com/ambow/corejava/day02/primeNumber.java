package com.ambow.corejava.day02;

/**
 * Created by Dw.L on 2017/7/11.
 */
public class primeNumber {

    public void demo(){

        int j;
        for (int i = 2; i <= 100; i++)
        {
            j = 2;
            while (i % j != 0) {
                j++;
            }
            if (j == i)
            {
                System.out.print(i+"  ");
            }
        }
    }

}
