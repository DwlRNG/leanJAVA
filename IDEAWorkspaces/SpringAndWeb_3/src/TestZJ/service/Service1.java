package TestZJ.service;

import TestZJ.dao.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Dw.L on 2017/5/3.
 */

@Service("service1")
public class Service1 {

    @Resource(name = "user")
    private User user;

    public void Servicesay(){

        System.out.println("IM SERVICE");

        user.say();

    }


}
