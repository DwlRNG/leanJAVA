package cn.bank.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import cn.bank.service.zhuanzhuang;

/**
 * Created by Dw.L on 2017/5/2.
 */



public class testBank {


    @Test

    public void testbank(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

       zhuanzhuang z = (zhuanzhuang) context.getBean("service");

       z.servicezuanzhang();
    }



    @Test

    public void testbank2(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        zhuanzhuang z = (zhuanzhuang) context.getBean("service");

        z.servicezuanzhang2();

    }
}
