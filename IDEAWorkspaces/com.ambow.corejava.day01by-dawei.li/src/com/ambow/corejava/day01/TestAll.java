package com.ambow.corejava.day01;

import org.junit.Test;

/**
 * Created by Dw.L on 2017/7/10.
 */
public class TestAll {

    @Test
    public void fun1(){     //测试作业二

        personFactory personFactory = new personFactory();

        personAttribute personAttribute = personFactory.getpersonAttribute(personFactoryType.dawei);

        /*personAttribute personAttribute = personFactory.getpersonAttribute(personFactoryType.XXX1);*/

        personAttribute.SelfIntroduction();

        personAttribute.Ability1();


    }

    @Test
    public void fun3_1(){   //测试作业三--1
        do_while do_while = new do_while();

        do_while.ride();
    }


/*
*
* 作业三--2为Year类
* */


    @Test
    public void fun3_3(){  //测试作业三--3

        int line=8;
        for(int i=1;i<=line;i++){
            for(int j=0;j<line-i;j++){//用来输出制表符的。因为数字有123位的，用空格不整齐
                System.out.print(" ");
            }
            for(int j=1;j<Math.pow(2, i);j*=2){//输出依次增大的Math.pow(2, i)是求2的i次方
                System.out.print(j+" ");
            }
            for(int j=(int)Math.pow(2, i-2);j>0;j/=2){//输出依次减小的
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    }

