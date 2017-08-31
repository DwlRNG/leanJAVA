package com.ambow.corejava.day02;

/**
 * Created by Dw.L on 2017/7/11.
 */
public class BubbleSort {

    public void demo() {

        int[] a = { 56, 23, 22, 11, 33, 26, 86, 99, 55, 66 };
        BubbleSort.bubbleSort(a);
        for (int b : a) {
            System.out.print(b + " ");
        }
    }

    public static void bubbleSort(int a[]) {

        for (int i = 1; i < a.length; i++) {

            for (int j = 0; j < a.length - i; j++) {

                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
