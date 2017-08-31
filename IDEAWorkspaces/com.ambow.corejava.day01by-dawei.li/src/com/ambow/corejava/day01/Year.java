package com.ambow.corejava.day01;

/**
 * Created by Dw.L on 2017/7/10.
 *
 *练习3—2 输入指定的年的月份  计算天数
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Year {
    public static void main(String[] args) {
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
        int day = 0, month = 0, year = 0;
        boolean bool = true;
        do {
            try {
                System.out.println("输入年份:");
                year = Integer.parseInt(sc.readLine());
                System.out.println("输入月份:");
                month = Integer.parseInt(sc.readLine());
                if( (month>12 || month<1) || year <= 0){
                    System.out.print("输入的年份或者月份有问题\n");
                    bool = false;
                }
            } catch (NumberFormatException e) {
                System.out.print(
                        "输入有误，你输入的是：" + e.getMessage().substring(e.getMessage().indexOf("\"")+1,
                                e.getMessage().lastIndexOf("\"")) + "\n请重新输入");
                bool = false;
            } catch (IOException e) {
                System.out.print(
                        "输入有误，你输入的是：" +e.getMessage().substring(e.getMessage().indexOf("\"")+1,
                                e.getMessage().lastIndexOf("\"")) + "\n请重新输入");
                bool = false;
            }
        } while (!bool);
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 2:
                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                                                                             // 2月只有29天
                    day = 29;
                } else {
                    day = 28;
                }
                break;
            default:
                day = 30;
        }
        System.out.println(year + "-" + month + "有:" + day + "天");
    }
}