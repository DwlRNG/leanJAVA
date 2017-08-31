package cn.KJ.Service;

import cn.KJ.Daomian.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dw.L on 2017/4/29.
 */
public class Testuser {

    @Test
    //注解得到要调用的类的对象
    public void testuser(){

        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");

        User user = (User) context.getBean("user");          //注解名字 调用的类的注解名字

        user.out();

    }




    @Test
    //用注解注入属性为对象  调用这个属性为对象的 参数即可调用 属性为对象的那个类的方法
    public void testuser2(){

        ApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");

        service service = (service) context.getBean("service1");

        service.out();


    }



}
