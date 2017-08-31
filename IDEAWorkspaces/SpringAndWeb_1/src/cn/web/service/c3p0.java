package cn.web.service;

import cn.web.dao.Testc3p0;
import org.junit.Test;

/**
 * Created by Dw.L on 2017/5/1.
 */
public class c3p0 {

/*
* 属性为对象的注入
* */
    public void setTestc3p0(Testc3p0 testc3p0) {
        this.testc3p0 = testc3p0;
    }
    private Testc3p0 testc3p0;

    public void useTestc3p0(){

        System.out.println("这里是setTestc3p0的类的useTestc3p0方法");

        testc3p0.add();
    }



}
