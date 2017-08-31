package service;

import dao.daoperson;

/**
 * Created by Dw.L on 2017/4/28.
 */
public class service {

    private daoperson daoperson;

    public void setDaoperson(dao.daoperson daoperson) {
        this.daoperson = daoperson;
    }

    public void serviceout(){

        System.out.println("我是service的out方法");
        daoperson.out();

    }




}
