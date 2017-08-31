package com.ambow.corejava.day01;


/**
 * Created by Dw.L on 2017/7/10.
 */
public class personFactory{

    private static personFactory pr;

    personFactory(){
    }

    public static personFactory getpr(int i){

        if (pr == null) {
            personFactory pr = new personFactory();
        }
        return pr;

    }

    public personAttribute getpersonAttribute(int i){

        personAttribute personAttribute = null;

        if (i == 1) {
            return personAttribute = new dawei();
        }
        if (i == 2) {
            return personAttribute = new XXX1();
        }

        return personAttribute;
    }



}



