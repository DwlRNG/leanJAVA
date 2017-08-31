
import cn.web.dao.Zjtest1;
import cn.web.service.bei_Enhance;
import cn.web.service.c3p0;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dw.L on 2017/4/30.
 */
public class testALL {

    @Test
    public void  test1(){  //通过配置文件增强类

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
       bei_Enhance bei_enhance =(bei_Enhance) context.getBean("bei");
       bei_enhance.bei_Enhancefun();
    }


    @Test
    public  void test_Zjtest1_ZjEnchance(){   //通过注解增强类

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Zjtest1 zjtest1 = (Zjtest1) context.getBean("zjtest1");

        zjtest1.Zjsay();
    }

    @Test
    public  void test_c3p0_Testc3p0(){   //测试  使用spring模板  操作数据库

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        c3p0 c3p0 = (c3p0) context.getBean("c3p0");

        c3p0.useTestc3p0();
    }







}
