package com.ambow.corejava.day02;

/**
 * Created by Dw.L on 2017/7/11.
 */
public class dichotomy {

    public void demo(){
        int[] a = {56, 23, 22, 11, 33, 26, 86, 99, 55, 66};
        int max = 0;
        int tmp = 0;
        for(int i=0;i<a.length;i++){
            max = i;

            for(int j=i+1;j<a.length;j++){
                if(a[max]<a[j])
                    max = j;
            }

            if(i!=max){
                tmp = a[i];
                a[i] = a[max];
                a[max] = tmp;
            }
        }
        for (int i =9;i>=0;i--){
            System.out.print(a[i]+" ");
        }
    }

}
