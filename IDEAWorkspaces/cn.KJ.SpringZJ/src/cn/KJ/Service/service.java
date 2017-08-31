package cn.KJ.Service;

import cn.KJ.Daomian.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Dw.L on 2017/4/29.
 */
@Service("service1")  //注解  service层的注解
public class service {

   /* @Autowired      //自动注入对象    相当于调用  set  get方法
    private User user;*/

   @Resource(name = "user")  //指定注解名注入 对象
   private  User user;

    public void out(){

        System.out.println("我来自service");
        user.out();

    }





}
