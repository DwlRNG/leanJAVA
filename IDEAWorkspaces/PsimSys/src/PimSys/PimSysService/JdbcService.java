package PimSys.PimSysService;

import PimSys.PimSysDao.JdbcDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


/**
 * Created by Dw.L on 2017/6/4.
 */


@Service("jdbcService")

@Transactional
public class JdbcService {


    //查询用户名可返回密码
    public String judeadminanmae(String aname,String apassword){


        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JdbcDao dao = (JdbcDao) applicationContext.getBean("jdbcDao");

        return dao.judeadminnaem(aname,apassword);

    }


    //添加员工
    public boolean add(String workid,String workname,String name,String gender,String phone){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JdbcDao dao = (JdbcDao) applicationContext.getBean("jdbcDao");

        return dao.add(workid,workname,name,gender,phone);

    }

    //查找某个员工
    public boolean findone(String workid){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JdbcDao dao = (JdbcDao) applicationContext.getBean("jdbcDao");

        return dao.findone(workid);

    }

    //查找某个员工的详细信息

    public List findallone(String workid){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JdbcDao dao = (JdbcDao) applicationContext.getBean("jdbcDao");

        return dao.findallone(workid);
    }

    //查找所有员工
    public List findall(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JdbcDao dao = (JdbcDao) applicationContext.getBean("jdbcDao");

        return dao.findall();


    }

    //删除某个员工
    public void delete(String workid){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JdbcDao dao = (JdbcDao) applicationContext.getBean("jdbcDao");

        dao.delete(workid);

    }

    //修改员工
    public boolean rework(String workid,String workname,String name,String gender,String phone){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        JdbcDao dao = (JdbcDao) applicationContext.getBean("jdbcDao");

        return dao.rework(workid, workname, name, gender, phone);

    }



}
