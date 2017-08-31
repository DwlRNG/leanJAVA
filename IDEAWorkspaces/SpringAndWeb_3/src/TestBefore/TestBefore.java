package TestBefore;

import TestBefore.daomain.before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dw.L on 2017/5/22.
 */
public class TestBefore {

    @Test
    public void fun(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        before before = (before) applicationContext.getBean("before");

        before.zhengqiangspeak();

    }
}
