package dao;


import daomian.admin;
import daomian.baoxiu;
import daomian.wstudents;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.junit.Test;
import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.List;

/**
 * Created by王伟 on 2017/6/2.
 *
 * 操作的数据库 mybd3  涉及表  admin,wstudents
 *
 */
public class dao {

    Utils utils = new Utils();


    //管理员登录验证

    public boolean yanzheng(String aname, String apassword) throws PropertyVetoException, SQLException {

        QueryRunner queryRunner = utils.getconnection();

        String sql = "select * from admin where aname=? and apassword=?";

        Object[] parm = {aname, apassword};

        admin a = queryRunner.query(sql, new BeanHandler <admin>(admin.class), parm);


        if (a.getAid() != 0) {

            return true;
        } else {
            return false;
        }


    }

/*
    @Test

    public void Testyanzheng() throws PropertyVetoException, SQLException {

        String aname = "admin001";
        String apassword = "admin001";

        QueryRunner queryRunner = utils.getconnection();

        String sql = "select * from admin where aname=? and apassword=?";

        Object[] parm = {aname,apassword};

        admin a = queryRunner.query(sql, new BeanHandler <admin>(admin.class), parm);

        System.out.println("管理员序号为:"+a.getAid());
    }
*/


    //添加学生信息方法
    public boolean addstudents(String sname, String sclass, String snumber, String sphone, String dorm, String sgender) throws PropertyVetoException, SQLException {

        QueryRunner queryRunner = utils.getconnection();

        String sql = "insert into wstudents values(?,?,?,?,?,?)";

        Object[] parm = {sname, sclass, snumber, sphone, dorm, sgender};

        int a = queryRunner.update(sql, parm);

        if (a == 1) {
            return true;
        }
        return false;

    }



/*
    @Test
    public void Testaddstudents() throws PropertyVetoException, SQLException {


        QueryRunner queryRunner = utils.getconnection();


        String sname = "刘德华";
        String sclass = "01";
        String snumber = "110";
        String sphone = "111";
        String dorm = "111";
        String sgender  = "111";

        String sql = "insert into wstudents values(?,?,?,?,?,?)";

        Object[] parm = {sname,sclass,snumber,sphone,dorm,sgender};

        int a = queryRunner.update(sql, parm);

        System.out.println(a);


    }
*/


    //删除学生信息的方法
    public boolean deletestudents(String snumber, String sname) throws PropertyVetoException, SQLException {

        QueryRunner queryRunner = utils.getconnection();
        String sql = "delete from wstudents where snumber=? and sname=?";
        Object[] parm = {snumber, sname};
        int a = queryRunner.update(sql, parm);

        if (a == 1) {
            return true;
        }
        return false;

    }

/*    @Test
    public void testdeletestudents() throws PropertyVetoException, SQLException {

        String snumber = "110";
        String sname = "刘德华";

        QueryRunner queryRunner = utils.getconnection();

        String sql = "delete from wstudents where snumber=? and sname=?";

        Object[] parm = {snumber,sname};

        int a  = queryRunner.update(sql, parm);

        System.out.println(a);
    }*/

    //查找学生信息方法
    public wstudents findstudents(String snumber, String sname) throws PropertyVetoException, SQLException {

        QueryRunner queryRunner = utils.getconnection();

        String sql = "select * from wstudents where snumber=? and sname=?";

        Object[] parm = {snumber, sname};

        wstudents ws = queryRunner.query(sql, new BeanHandler <wstudents>(wstudents.class), parm);

        return ws;

    }

/*    @Test
    public void testfindstudents() throws SQLException, PropertyVetoException {

        String snumber = "110";
        String sname = "刘德华";

        QueryRunner queryRunner = utils.getconnection();

        String sql = "select * from wstudents where snumber=? and sname=?";

        Object[] parm = {snumber,sname};

        wstudents ws = queryRunner.query(sql, new BeanHandler <wstudents>(wstudents.class), parm);

        System.out.println("寝室号是:"+ ws.getDorm());
    }*/


    //修改学生信息方法
    public boolean restudents(String sname, String sclass, String snumber, String sphone, String dorm, String sgender) throws PropertyVetoException, SQLException {


        QueryRunner queryRunner = utils.getconnection();

        String sql = "update wstudents set sname=?,sclass=?,sphone=?,dorm=?,sgender=? where snumber=?";

        Object[] parm = {sname, sclass, sphone, dorm, sgender, snumber};

        int a = queryRunner.update(sql, parm);

        if (a == 1) {
            return true;
        } else {
            return false;
        }

    }


/*    @Test
    public void testrestudents() throws PropertyVetoException, SQLException {

        String sname = "赵本山";
        String sclass = "012";
        String snumber = "000";
        String sphone = "1112";
        String dorm = "111";
        String sgender  = "111";

        QueryRunner queryRunner = utils.getconnection();

        String sql = "update wstudents set sname=?,sclass=?,sphone=?,dorm=?,sgender=? where snumber=?";

        Object[] parm = {sname,sclass,sphone,dorm,sgender,snumber};

        int a = queryRunner.update(sql, parm);

        System.out.println(a);

    }*/

    //宿舍添加保修情况
    public boolean addbaoxiu(String dorm, String mag, String sname, String snumber) throws PropertyVetoException, SQLException {

        QueryRunner queryRunner = utils.getconnection();


        String sql = "insert into baoxiu VAlue(?,?,?,?)";

        Object[] parm = {dorm, mag, sname, snumber};

        int a = queryRunner.update(sql, parm);
        if (a == 1) {
            return true;
        }

        return false;

    }

   /* @Test
    public void addbaoxiu () throws PropertyVetoException, SQLException {

        String dorm = "5栋607";
        String mag = "没水";
        String sname = "刘德华";
        String snumber = "15656";

        QueryRunner queryRunner = utils.getconnection();


        String sql = "insert into baoxiu VAlue(?,?,?,?)";

        Object[] parm = {dorm, mag, sname, snumber};

        int a = queryRunner.update(sql, parm);
        System.out.println(a);

    }*/


    //查找宿舍保修情况
    public baoxiu findbaoxiu(String dorm) throws PropertyVetoException, SQLException {

        QueryRunner queryRunner = utils.getconnection();

        String sql = "select * from baoxiu where dorm=?";

        Object[] parm = {dorm};

        baoxiu bx = queryRunner.query(sql, new BeanHandler <baoxiu>(baoxiu.class), parm);

        return bx;
    }

/*
     @Test

    public void fingbaoxiu() throws PropertyVetoException, SQLException {

         String dorm = "4栋606";

         QueryRunner queryRunner = utils.getconnection();

         String sql = "select * from baoxiu where dorm=?";

         Object[] parm = {dorm};

         baoxiu  bx = queryRunner.query(sql, new BeanHandler <baoxiu>(baoxiu.class), parm);

         System.out.println("报修人是:"+bx.getSnmae());

     }*/

    //删除保修情况
    public boolean deletebaoxiu(String dorm) throws SQLException, PropertyVetoException {

        QueryRunner queryRunner = utils.getconnection();
        String sql = "delete from baoxiu where dorm=?";
        Object[] parm = {dorm};
        int a = queryRunner.update(sql, parm);

        if (a == 1) {
            return true;
        }
        return false;

    }

/*    @Test
    public void deletebaoxiu() throws SQLException, PropertyVetoException {

        String dorm = "5栋607";

        QueryRunner queryRunner = utils.getconnection();
        String sql = "delete from baoxiu where dorm=?";
        Object[] parm = {dorm};
        int a  = queryRunner.update(sql, parm);
        System.out.println(a);
    }*/

    //查找全部学生
    public List findall() throws PropertyVetoException, SQLException {

        QueryRunner queryRunner = utils.getconnection();

        String sql = "SELECT * FROM wstudents";

        List <wstudents> list = queryRunner.query(sql, new BeanListHandler <wstudents>(wstudents.class));

        return list;

    }


/*    @Test
    public void findaii() throws SQLException, PropertyVetoException {

        QueryRunner queryRunner = utils.getconnection();

        String sql = "SELECT * FROM wstudents";

        List<wstudents> list = queryRunner.query(sql, new BeanListHandler <wstudents>(wstudents.class));

        for(int i = 0 ; i < list.size() ; i++) {
            wstudents stu = list.get(i);
            System.out.println(stu.getDorm()+"班级    "+stu.getSclass()+" 性别   "+stu.getSgender()+" 电话   "+stu.getSphone());
        }

    }*/

    //查看全部宿舍
    public List findallbaoxiu() throws PropertyVetoException, SQLException {

        QueryRunner queryRunner = utils.getconnection();

        String sql = "SELECT * FROM baoxiu";

        List <baoxiu> list = queryRunner.query(sql, new BeanListHandler <baoxiu>(baoxiu.class));

        return list;

    }


/*    @Test
    public void findallbaoxiuTest() throws SQLException, PropertyVetoException {

        QueryRunner queryRunner = utils.getconnection();

        String sql = "SELECT * FROM baoxiu";

        List <baoxiu> list = queryRunner.query(sql, new BeanListHandler <baoxiu>(baoxiu.class));

        for (int i = 0; i < list.size(); i++) {
            baoxiu stu = list.get(i);
            System.out.println(stu.getDorm() + "姓名    " + stu.getSnmae() + " 学号   " + stu.getSnumber() + " 信息   " + stu.getMag());
        }

    }*/


}
