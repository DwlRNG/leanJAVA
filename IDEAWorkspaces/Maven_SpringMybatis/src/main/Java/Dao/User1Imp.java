package Dao;


import Daomian.User1;
import Mapper.Mapper;
import User1Mapper.user1Mapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Dw.L on 2017/7/11.
 */


@Transactional

@Component("user1Imp")
public class User1Imp {

    private ApplicationContext applicationContext;


    @Test
    public void findone() throws Exception {   //配置Mapper方式测试

        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        Mapper mapper = (Mapper) applicationContext.getBean("Mapper");  //配置的Mapper的ID

        User1 user1 = mapper.findUserById(1);

        System.out.println(user1.getName());
    }


    @Test
    public void saomianfindone()throws Exception{  //扫描Mapper的方法

        applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        user1Mapper mapper = (user1Mapper) applicationContext.getBean("user1Mapper");   //自动扫描出的ID为mapper接口的类名首字母小写

        User1 user1 = mapper.findUserById(1);

        System.out.println(user1.getName());


    }


}
