package com.ambow.corejava.day01;

/**
 * Created by Dw.L on 2017/7/10.
 *
 * personAttribute Class
 *
 */
public abstract class personAttribute {



    private String name;            //姓名
    private String phone;           //电话
    private String home;            //住址
    private double wages;           //工资
    private int year;               //年龄
    private String Work;            //工作

    public void SelfIntroduction(){ //自我介绍

    }

    public void Ability1(){         //能力 1

    }

    public void Ability2(){

    }

    public void Ability3(){

    }

    /*
    * bean
    * */

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public void setWages(double wages) {
        this.wages = wages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setWork(String work) {
        Work = work;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getHome() {
        return home;
    }

    public double getWages() {
        return wages;
    }

    public int getYear() {
        return year;
    }

    public String getWork() {
        return Work;
    }
}
