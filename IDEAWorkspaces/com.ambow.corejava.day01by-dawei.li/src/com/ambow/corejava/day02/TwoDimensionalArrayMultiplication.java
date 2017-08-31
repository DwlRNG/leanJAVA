package com.ambow.corejava.day02;

/**
 * Created by Dw.L on 2017/7/11.
 */
public class TwoDimensionalArrayMultiplication {

    public void demo(){
        int[][] A={{1,2,3,4},
                {5,6,7,8},
                {8,7,6,5},
                {4,3,2,1},
                {1,2,3,4}};

        int [][]B={{3,4,1,2,1,2},
                {5,6,4,9,0,3},
                {3,2,7,2,4,6},
                {9,7,4,7,8,6}};

        int [][]C= new int [5][6];
        int i,j,k;
        for(i=0;i<5;i++){
            for(j=0;j<6;j++){
                C[i][j]=0;
            }
        }

        for(i=0;i<5;i++){
            for(j=0;j<6;j++){
                for(k=0;k<4;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }

        for(i=0;i<5;i++){
            for(j=0;j<6;j++){
                System.out.print("  "+C[i][j]+"  ");
            }
            System.out.println();
        }

    }

}
