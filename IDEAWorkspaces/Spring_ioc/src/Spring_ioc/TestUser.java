package Spring_ioc;

import Spring_ioc_user.Person;
import Spring_ioc_user.user;
import service.service;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dw.L on 2017/4/28.   全部ioc的  测试    注入 与注入对象属性
 */
public class TestUser {


    @Test

    public void TestUser(){
        //常用的方法 类的无参数构造  在user类中  默认存在无参构造函数 如果有 有参构造函数  必须创建无参构造函数 否则会报错 ontfind
        //配置文件的XML通常放在src下

        //解析配置文件 底层用dom4j读取到类名字 ，反射在创建出类的对象
        ApplicationContext context = new ClassPathXmlApplicationContext("ico.xml");
        //利用context对象+bean (xml中的ID)得到类的对象  注意强转
        user user = (user) context.getBean("user");

        System.out.println(user);
        user.out();



    }




    @Test

    /**
     * 属性的注入 通过ben的set方法
     * */
    public  void TestPersn(){
         ApplicationContext context = new ClassPathXmlApplicationContext("ico.xml");
         Person p = (Person) context.getBean("person");
         p.out();
    }


    @Test

    /**
     * 属性的注入 通过ben 的有参构造方法
     * */
    public void  Testperson2(){

        ApplicationContext context = new ClassPathXmlApplicationContext("ico.xml");

        Person person2 = (Person) context.getBean("person2");

        person2.out();
    }

    @Test
    /**
    * 属性注入对象 通过set 注入
    * */
    public void  Testservice(){

        ApplicationContext context = new ClassPathXmlApplicationContext("ico.xml");

        service service =(service) context.getBean("service");

        service.serviceout();


    }




















    /**
     *
     * 使用静态工厂的方式创建 ben对象
     *
     *
     * */
/*
    public void TestUser2(){

        //解析配置文件 底层用dom4j读取到类名字 ，反射在创建出类的对象

        ApplicationContext context = new ClassPathXmlApplicationContext("ico.xml");

        //利用context对象+bean  “ID”得到类的对象  注意强转

        user2 user2 = (user2) context.getBean("User2");

        System.out.println(user2);

        user2.out2();

    }
*/


}
