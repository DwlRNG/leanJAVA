package cn.KJ.Daomian;

import javax.annotation.Resource;

/**
 * Created by Dw.L on 2017/4/29.
 */
public class family {

    @Resource(name = "father")
    father f;

    @Resource(name = "mother")
    mother m;
    public void family() {
        System.out.println("我们是一个家庭：");
        f.say();
        m.say();

    }
}
