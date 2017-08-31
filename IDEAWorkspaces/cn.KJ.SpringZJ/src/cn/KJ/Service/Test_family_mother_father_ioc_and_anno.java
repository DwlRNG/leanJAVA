package cn.KJ.Service;

import cn.KJ.Daomian.family;
import cn.KJ.Daomian.father;
import cn.KJ.Daomian.mother;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Dw.L on 2017/4/29.
 */
public class Test_family_mother_father_ioc_and_anno {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("ico_and_anno.xml");

        father f =(father) context.getBean("father");
        mother m = (mother) context.getBean("mother");
        family ff = (family) context.getBean("family");

        f.say();
        m.say();
        ff.family();

    }

}
