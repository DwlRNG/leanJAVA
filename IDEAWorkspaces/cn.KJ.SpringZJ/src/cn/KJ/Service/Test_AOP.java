package cn.KJ.Service;

import cn.KJ.Daomian.needBefore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dw.L on 2017/4/30.
 */
public class Test_AOP {

  @Test
    public void Test_before_AOP(){  //前置增强测试

      ApplicationContext context =new ClassPathXmlApplicationContext("Test_aop.xml");

      needBefore  needBefore =(needBefore)  context.getBean("needbefore");

      needBefore.needBeforesay();
    }



    @Test
    public void Test_afte_AOP(){  //后置增强测试


      ApplicationContext context =new ClassPathXmlApplicationContext("Test_aop.xml");

      needBefore  needBefore =(needBefore) context.getBean("needbefore");

      needBefore.needBeforesay();

    }


    @Test
  public void Test_around_AOP(){  //环绕增强测试


    ApplicationContext context =new ClassPathXmlApplicationContext("Test_aop.xml");

    needBefore  needBefore =(needBefore) context.getBean("needbefore");

    needBefore.needBeforesay();

  }
}
