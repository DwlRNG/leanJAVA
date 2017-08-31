package TestZJ;

import TestZJ.service.Service1;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dw.L on 2017/5/3.
 */
public class test {


    @Test
    public void  fun(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

       Service1 service1 =(Service1) context.getBean("service1");
       service1.Servicesay();
    }
}
