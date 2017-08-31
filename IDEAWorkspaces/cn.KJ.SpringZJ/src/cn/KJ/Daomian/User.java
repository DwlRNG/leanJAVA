package cn.KJ.Daomian;

import org.springframework.stereotype.Component;

/**
 * Created by Dw.L on 2017/4/29.
 */

@Component("user")     //创建注解   注解是注解类
public class User {
    private String name;

    private int age;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void out(){

        System.out.println("注解得到的。。。。。。。。");

    }
}
