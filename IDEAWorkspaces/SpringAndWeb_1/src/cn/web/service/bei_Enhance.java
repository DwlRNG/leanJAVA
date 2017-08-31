package cn.web.service;

import cn.web.dao.test1;

/**
 * Created by Dw.L on 2017/4/30.
 */
public class bei_Enhance {

    test1 t;
    public void setT(test1 t) {
        this.t = t;
    }

    public  void bei_Enhancefun(){

        System.out.println("我是被增强的类中的bei_Enhancefun方法下面是我调用的类");
        t.test_fun1();

    }
}
