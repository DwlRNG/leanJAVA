package Jdbctemplate;

import Jdbctemplate.daomian.dao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Dw.L on 2017/5/22.
 */


@Transactional
public class test {

    @Test
    public void  test_dao_findall(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        dao dao  = (dao) context.getBean("dao");

        dao.findall();
    }

    @Test
    public  void test_dao_deleteUser(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        dao dao  = (dao) context.getBean("dao");

        dao.deleteUser("002");



    }


    @Test
    public  void test_dao_addUSer(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        dao dao = (dao) context.getBean("dao");

        dao.addUser("","","");

    }


    @Test
    public void test_dao_findInOne(){

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        dao dao = ( dao) context.getBean("dao");

        dao.findInOne("003");

    }








}
