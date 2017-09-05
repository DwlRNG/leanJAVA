package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.datasorcemenu;

/**
 * Created by Dw.L on 2017/9/5.
 */


public class testfind {



    @Test
    public void fun1(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");


        datasorcemenu d = (datasorcemenu) applicationContext.getBean("datasorcemenu");

        d.find();
    }


}
