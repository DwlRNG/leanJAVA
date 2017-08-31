package Db.login.Service;

import Db.login.Domain.Domain;
import Db.login.mian.Students;

import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.Map;

/**
 * Created by Dw.L on 2017/4/19.
 */
public class Jude {

    private Domain domain = new Domain();


    //管理员判断
    public boolean AdminJude(String getaname, String getapassword) throws PropertyVetoException, SQLException {

        /*System.out.println("调用到这里了service1");*/
        return domain.Judeadmin(getaname,getapassword);

    }


    //学生判断
    public boolean StudetsJude(String getsname, String getspassword) throws PropertyVetoException, SQLException {

       /* System.out.println("调用到这里了service2");*/
        return domain.JudeStudents(getsname, getspassword);

    }

    //管理员添加学生
    public boolean adminaddstudents(String getsid,String getsname, String getsgender ,String getsmajor,String getsclass,String getshome,String getsphone,String getspassword) throws PropertyVetoException, SQLException {

        /*System.out.println("调用到这里了service3");*/
        return domain.adminaddstudents(getsid, getsname,  getsgender , getsmajor , getsclass,  getshome, getsphone , getspassword);


    }



    //查询学生

    public Students adminfindstudents(String sname, String smajor) throws PropertyVetoException, SQLException {


        return domain.findstudents(sname, smajor);

    }

    //修改学生信息之查询

    public Students find(String sname, String smajor) throws PropertyVetoException, SQLException {
       /* System.out.println("到达service find");*/
        return domain.find(sname, smajor);
    }


    //修改学生信息之修改

    public boolean modify(String getsid,String getsname, String getsgender ,String getsmajor,
                          String getsclass, String getshome,String getsphone,String getspassword) throws PropertyVetoException, SQLException {


        return domain.modify(getsid, getsname,  getsgender , getsmajor , getsclass,  getshome, getsphone , getspassword);


    }


    //删除学生信息

    public boolean delete(String sname, String smajor) throws PropertyVetoException, SQLException {


        return domain.delete(sname, smajor);

    }







}
