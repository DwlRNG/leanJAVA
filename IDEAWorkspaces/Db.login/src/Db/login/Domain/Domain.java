package Db.login.Domain;

import Db.login.Utils.Getconnection;
import Db.login.mian.Admin;
import Db.login.mian.Students;
import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.junit.Test;
import sun.swing.BakedArrayList;
import java.util.ArrayList;

import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by Dw.L on 2017/4/19.
 */
public class Domain {
    private Getconnection getconnection = new Getconnection();

    public boolean Judeadmin(String getaname,String getapassword) throws PropertyVetoException, SQLException {
        /**
        * 管理员登录判断方法 判断是否为管理员登录
        * */

        QueryRunner queryRunner = getconnection.getconnection();

        String sql = "select * from admin where aname=? and apassword=?";

        Object[] parm = {getaname, getapassword};

        Admin admin = queryRunner.query(sql,new BeanHandler<Admin>(Admin.class),parm);

        if (admin.getApassword()!=null) {
            return true;
        }
        else
            return false;

    }


    public boolean JudeStudents(String getsname, String getspassword) throws PropertyVetoException, SQLException {
        /**
         * 学生登录判断方法
         */
        QueryRunner queryRunner = getconnection.getconnection();

        String sql = "select * from students where sname=? and spassword=?";

        Object[] parm = {getsname, getspassword};

        Students  students = queryRunner.query(sql,new BeanHandler<Students>(Students.class),parm);

        if (students.getSpassword()!=null) {

            return true;

        }else

            return false;
    }


   /*
   @Test      //测试登录   OK
    public void Judeadmin() throws PropertyVetoException, SQLException {

        QueryRunner queryRunner = getconnection.getconnection();

        String sql = "select * from students where sname=? and spassword=?";

        Object[] parm = {"刘德华0", "10000"};

        Students students = queryRunner.query(sql,new BeanHandler<Students>(Students.class),parm);

        if (students.getSpassword()!=null) {

            System.out.println("性别是："+students.getShome());

        }else
            System.out.println("GG");

    }*/

   //添加学生
   public boolean adminaddstudents(String getsid,String getsname, String getsgender ,String getsmajor,String getsclass,String getshome,String getsphone,String getspassword) throws PropertyVetoException, SQLException {

       QueryRunner queryRunner = getconnection.getconnection();


       String sql = "insert into students values(?,?,?,?,?,?,?,?)";

       Object[] parm = {getsid, getsname,  getsgender , getsmajor , getsclass,  getshome, getsphone , getspassword};

       int back = queryRunner.update(sql, parm);

       if (back==1){
           return true;
       }
       return false;

   }


/*    @Test  //添加测试   OK
    public void fun() throws PropertyVetoException, SQLException {
       String getsid = "1004";
       String getsname = "赵本山";
       String getsmajor = "0004";
       String getsclass = "05";
       String getshome = "铁岭";
       String getsphone = "10086";
       String getspassword = "1004";
       String getsgender = "男";

       QueryRunner queryRunner = getconnection.getconnection();
       String sql = "insert into students values(?,?,?,?,?,?,?,?)";
       Object[] parm = {getsid, getsname,  getsgender , getsmajor , getsclass,  getshome, getsphone , getspassword};
       queryRunner.update(sql, parm);


   }*/


    //查询学生信息方法
    public Students findstudents(String sname, String smajor) throws PropertyVetoException, SQLException {


        QueryRunner queryRunner = getconnection.getconnection();


        String sql = "select * from students where sname=? and smajor=?";


        Object[] parm = {sname, smajor};


        Students students = queryRunner.query(sql, new BeanHandler<Students>(Students.class), parm);

        return students;
    }



   /*@Test
    public void fun2() throws PropertyVetoException, SQLException{

        String sname = "刘能";
        String smajor = "0006";

        QueryRunner queryRunner = getconnection.getconnection();

        String sql = "select * from students where sname=? and smajor=?";
        Object[] parm = {sname, smajor};

        Students students = queryRunner.query(sql, new BeanHandler<Students>(Students.class), parm);

        System.out.println(students.getShome());

    }*/


    //修改学生方法之查询
    public Students find(String sname ,String smajor) throws PropertyVetoException, SQLException {

        System.out.println();
        QueryRunner queryRunner = getconnection.getconnection();

        String sql = "select * from students where sname=? and smajor=?";

        Object[] parm = {sname, smajor};

        Students st = queryRunner.query(sql, new BeanHandler<Students>(Students.class), parm);

        return st;

    }


    //修改学生方法之修改

    public boolean modify(String getsid,String getsname, String getsgender ,String getsmajor,
                          String getsclass, String getshome,String getsphone,String getspassword) throws PropertyVetoException , SQLException{

        QueryRunner queryRunner = getconnection.getconnection();

        String sql = "update students set sname = ?, sgender = ?,smajor = ?,sclass = ?,shome = ?,sphone = ?,spassword = ? where sid=?";

        Object[] parm = { getsname,  getsgender , getsmajor , getsclass,  getshome, getsphone , getspassword,getsid};

        int back = queryRunner.update(sql, parm);

        if (back==1){
            return true;
        }
        return false;

    }


   /**  测试修改学生方法之修改   OK
    * @Test
    public void fun_modify() throws PropertyVetoException , SQLException{
        QueryRunner queryRunner = getconnection.getconnection();
        String getsid = "1007";
        String getsname = "刘德能";
        String getsgender = "女";
        String getsmajor = "0006";
        String getsclass = "10";
        String getshome = "日本";
        String getsphone  = "911";
        String getspassword = "123";


        String sql = "update students set sname = ?, sgender = ?,smajor = ?,sclass = ?,shome = ?,sphone = ?,spassword = ? where sid=?";

        Object[] parm = { getsname,  getsgender , getsmajor , getsclass,  getshome, getsphone , getspassword,getsid};

        int back = queryRunner.update(sql, parm);

        System.out.println(back);

    }*/


   public boolean delete(String sname,String smajor) throws PropertyVetoException, SQLException {

       QueryRunner queryRunner = getconnection.getconnection();

       String sql = "delete from students where sname=? and smajor=?";

       Object[] parm = {sname, smajor};

      int delete =  queryRunner.update(sql, parm);


       if (delete == 1) {
           return true;
       }
       return false;
   }
































    //多条件组合查询

/*
    public List<Students> criteriafind(String getsid,String getsname,String getshome) throws PropertyVetoException, SQLException {

        QueryRunner queryRunner = getconnection.getconnection();

        List<Object> parm = new ArrayList<Object>();                                //创建一个集合用来装在参数  给？赋值的参数

        StringBuilder sql = new StringBuilder("select * from students where 1=1");  //可变的sql模板   where 1=1 为了后面添加的语句前面都能写and


        String sid = getsid;
        if (sid != null && sid.trim().isEmpty()) {                                  //判断sid是否为空

            sql.append("and sid = ?");                                              //向sql中添加语句
            parm.add(sid);                                                          //给？赋值
        }


        String sname = getsname;
        if (sname != null && sname.trim().isEmpty()) {                              //判断sname是否为空

            sql.append("and sname = ?");                                            //向sql中添加语句
            parm.add(sname);                                                         //给？赋值
        }

        String shome = getshome;
        if (shome != null && shome.trim().isEmpty()) {                              //判断shome是否为空

            sql.append("and shome = ?");                                            //向sql中添加语句
            parm.add(shome);                                                        //给？赋值
        }

        List<Students> list = queryRunner.query(sql.toString(), new BeanListHandler<Students>(Students.class), parm.toArray()); //返回一个list集合

        return list;


    }

    @Test


    public void criteriafind() throws PropertyVetoException, SQLException {
        String getsid = "c";

        String getsname = "c";

        String getshome = "c";



        QueryRunner queryRunner = getconnection.getconnection();

        List<Object> parm = new ArrayList<>();                                //创建一个集合用来装在参数  给？赋值的参数

        StringBuilder sql = new StringBuilder("select * from students where 1=1");  //可变的sql模板   where 1=1 为了后面添加的语句前面都能写and

        String sid = getsid;
        if (sid != null && sid.trim().isEmpty()) {                                  //判断sid是否为空

            sql.append("and sid = ?");                                              //向sql中添加语句
            parm.add(sid);                                                          //给？赋值
        }


        String sname = getsname;
        if (sname != null && sname.trim().isEmpty()) {                              //判断sname是否为空

            sql.append("and sname = ?");                                            //向sql中添加语句
            parm.add(sname);                                                         //给？赋值
        }

        String shome = getshome;
        if (shome != null && shome.trim().isEmpty()) {                              //判断shome是否为空

            sql.append("and shome = ?");                                            //向sql中添加语句
            parm.add(shome);                                                        //给？赋值
        }


        List<Students> list = queryRunner.query(sql.toString(), new BeanListHandler<Students>(Students.class), parm.toArray()); //返回一个list集合

        for (int i = 0; i<list.size();i++) {
            Students students = list.get(i);
            System.out.println(students.getSid()+"   "+students.getSname()+"   "+students.getSgender()+"   "+students.getShome());

        }


    }*/
































}
