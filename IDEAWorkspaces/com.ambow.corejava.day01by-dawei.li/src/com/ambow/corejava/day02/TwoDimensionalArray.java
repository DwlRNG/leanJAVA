package com.ambow.corejava.day02;

/**
 * Created by Dw.L on 2017/7/11.
 */
public class TwoDimensionalArray {

    public void demo(){

        int[][] list1 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] list2 = {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}};
        int[][] result = new int[3][3];
        for(int i=0; i<list1.length; i++) {
            for (int j = 0; j < list1[i].length; j++) {
                result[i][j] = list1[i][j] + list2[i][j];
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("  "+result[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
