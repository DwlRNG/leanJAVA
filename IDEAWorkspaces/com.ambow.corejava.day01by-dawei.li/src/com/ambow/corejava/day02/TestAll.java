package com.ambow.corejava.day02;

import org.junit.Test;


/**
 * Created by Dw.L on 2017/7/11.
 */
public class TestAll {

    @Test
    public void fun1(){  //测试练习4-1

        Integersum integersum = new Integersum();
        integersum.sum();
    }

    @Test
    public void fun2(){ //测试练习4-2
        Array array = new Array();
        array.demo();
    }

    @Test
    public void fun3(){ //测试练习4-3
        Triangle triangle = new Triangle();
        triangle.demo();
    }

    @Test
    public void fun4(){ //测试练习4-4
        multiplicationTable multiplicationTable = new multiplicationTable();
        multiplicationTable.demo();
    }


    @Test
    public void fun5(){ //测试练习4-5

        primeNumber primeNumber = new primeNumber();
        primeNumber.demo();

    }

    @Test
    public void fun6(){ //测试练习5-1

        FibonacciSeries fibonacciSeries = new FibonacciSeries();
        fibonacciSeries.demo();

    }

    @Test
    public void fun7(){ //测试练习5-2
        TwoDimensionalArray twoDimensionalArray = new TwoDimensionalArray();
        twoDimensionalArray.demo();
    }

    @Test
    public void fun8(){ //测试练习5-3

        TwoDimensionalArrayMultiplication multiplication = new TwoDimensionalArrayMultiplication();
        multiplication.demo();
    }

    @Test
    public void fun10(){  //测试练习5-4
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.demo();
    }

    @Test
    public void fun11(){  //测试练习5-5

        dichotomy dichotomy = new dichotomy();
        dichotomy.demo();
    }






}
