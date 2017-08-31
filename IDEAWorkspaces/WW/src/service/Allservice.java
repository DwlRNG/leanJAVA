package service;

import dao.dao;
import daomian.baoxiu;
import daomian.wstudents;

import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by Dw.L on 2017/6/2.
 */
public class Allservice {

   private dao d = new dao();  //注入dao依赖

   //管理员登录验证方法
   public boolean adminjude(String aname,String apassword) throws PropertyVetoException, SQLException {

       return d.yanzheng(aname,apassword);

   }

   //添加学生方法
   public boolean addstudents(String sname, String sclass, String snumber, String sphone, String dorm, String sgender) throws PropertyVetoException, SQLException {

       return d.addstudents(sname, sclass, snumber, sphone, dorm,sgender);

   }

   //修改学生方法
    public boolean restudents(String sname, String sclass, String snumber, String sphone, String dorm, String sgender) throws PropertyVetoException, SQLException{

       return d.restudents(sname,sclass,snumber,sphone,dorm,sgender);
    }

    //删除学生的方法
    public boolean delestudents(String snumber,String sname) throws PropertyVetoException, SQLException {

        return d.deletestudents(snumber, sname);
    }

    //查找学生的方法
    public wstudents find(String snumber,String sname) throws PropertyVetoException, SQLException {

        return d.findstudents(snumber, sname);

    }
    //添加宿舍保修
    public boolean addbaoxiu(String dorm,String mag,String sname,String snumber) throws PropertyVetoException, SQLException {

        return d.addbaoxiu(dorm, mag, sname, snumber);

    }
    //查看宿舍保修情况
    public baoxiu findbaoxiu(String dorm) throws PropertyVetoException, SQLException {

        return d.findbaoxiu(dorm);

    }

    //删除宿舍保修情况
    public boolean deletebaoxiu(String dorm) throws PropertyVetoException, SQLException {
        return d.deletebaoxiu(dorm);

    }
    //查找全部学生
    public List findall() throws PropertyVetoException, SQLException {
       return d.findall();
    }
    //查找全部宿舍情况
    public List findallbaoxiu() throws PropertyVetoException, SQLException {

       return d.findallbaoxiu();

    }



}
