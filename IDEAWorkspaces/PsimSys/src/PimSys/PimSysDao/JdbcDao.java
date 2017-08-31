package PimSys.PimSysDao;

import PimSys.PimSysDaoMain.JdbcDaoAdmin;
import PimSys.PimSysDaoMain.JdbcDaoMain;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import javax.annotation.Resource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Dw.L on 2017/6/4.
 */



public class JdbcDao {

    @Resource(name = "jdbcDaoMain")
    private JdbcDaoMain jdbcDaoMain;

    @Resource(name = "jdbcdaoAdmin")
    private JdbcDaoAdmin jdbcdaoAdmin;

    //注入SpringJDBC模板对象
    private  JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    //查询用户名可返回密码
    public String judeadminnaem(String aname,String apassword) {

        String anmaefals="anmaefals";
        String apasswordfals = "apasswordfals";
        String trueright = "trueright";

        if ("李大卫".equals(aname)){

            String sql = "SELECT aname,apassword FROM admin WHERE aname=?";

            jdbcdaoAdmin = jdbcTemplate.queryForObject(sql, new MyRooMapperadmin(), aname);

            if (apassword.equals(jdbcdaoAdmin.getApassword())) {

                return trueright;

            }else {

                return apasswordfals;
            }

        }else{

            return anmaefals;
        }


    }


    //添加员工
    public boolean add(String workid, String workname, String name, String gender, String phone) {

        String sql = "INSERT INTO pimsys VALUES (?,?,?,?,?)";

        int a = jdbcTemplate.update(sql,workid,workname,name,gender,phone);

        if (a == 1) {
            return true;
        } else {
            return false;
        }


    }

    //修改员工
    public boolean rework(String workid, String workname, String name, String gender, String phone){

        String sql = "UPDATE pimsys SET workname=?,name=?,gender=?,phone=? WHERE workid=?";

        int a = jdbcTemplate.update(sql,workname,name,gender,phone,workid);

        if (a == 1) {
            return true;
        } else {
            return false;
        }

    }

    //查找全部员工

    public List findall(){

        String sql = "SELECT * FROM pimsys";

          List <JdbcDaoMain> list = jdbcTemplate.query(sql, new MyRooMapper());

          return list;
    }

    //查找某一个员工的id
    public boolean findone(String workid){

        String sql = "SELECT workid FROM pimsys WHERE workid=?";

        List<JdbcDaoMain> list = jdbcTemplate.query(sql, new MyRooMapperfidone(), workid);

        if (list.size() == 1) {
            return true;
        } else {

            return false;
        }

    }

    //查找某一个员工的信息
    public List findallone(String workid){

        String sql = "SELECT * FROM pimsys WHERE workid=?";

        List <JdbcDaoMain> list = jdbcTemplate.query(sql, new MyRooMapper(),workid);

        return list;
    }

    //删除某个员工
    public void delete(String workid){

        String sql = "DELETE FROM pimsys WHERE workid=?";

        jdbcTemplate.update(sql,workid);

    }





}


class MyRooMapper implements RowMapper<JdbcDaoMain>{

    @Override
    public JdbcDaoMain mapRow(ResultSet resultSet, int i) throws SQLException {


        /**
         *
         +----------+-------------+------+-----+---------+-------+
         | Field    | Type        | Null | Key | Default | Extra |
         +----------+-------------+------+-----+---------+-------+
         | workid   | varchar(50) | NO   | PRI |         |       |
         | workname | varchar(50) | YES  |     | NULL    |       |
         | name     | varchar(50) | YES  |     | NULL    |       |
         | gender   | varchar(12) | YES  |     | NULL    |       |
         | phone    | varchar(15) | YES  |     | NULL    |       |
         +----------+-------------+------+-----+---------+-------+
         *
         * */


        String workid  = resultSet.getString("workid");
        String workname = resultSet.getString("workname");
        String name = resultSet.getString("name");
        String gender = resultSet.getString("gender");
        String phone = resultSet.getString("phone");

        JdbcDaoMain jdbcDaoMain = new JdbcDaoMain();

        jdbcDaoMain.setWorkid(workid);
        jdbcDaoMain.setWorkname(workname);
        jdbcDaoMain.setName(name);
        jdbcDaoMain.setGender(gender);
        jdbcDaoMain.setPhone(phone);

        return jdbcDaoMain;
    }

}


class MyRooMapperfidone implements RowMapper<JdbcDaoMain>{

    @Override
    public JdbcDaoMain mapRow(ResultSet resultSet, int i) throws SQLException {


        /**
         *
         +----------+-------------+------+-----+---------+-------+
         | Field    | Type        | Null | Key | Default | Extra |
         +----------+-------------+------+-----+---------+-------+
         | workid   | varchar(50) | NO   | PRI |         |       |
         | workname | varchar(50) | YES  |     | NULL    |       |
         | name     | varchar(50) | YES  |     | NULL    |       |
         | gender   | varchar(12) | YES  |     | NULL    |       |
         | phone    | varchar(15) | YES  |     | NULL    |       |
         +----------+-------------+------+-----+---------+-------+
         *
         * */

        String workid = resultSet.getString("workid");

        JdbcDaoMain jdbcDaoMain = new JdbcDaoMain();

        jdbcDaoMain.setWorkname(workid);


        return jdbcDaoMain;
    }

}



class MyRooMapperadmin implements RowMapper<JdbcDaoAdmin>{

    @Override
    public JdbcDaoAdmin mapRow(ResultSet resultSet, int i) throws SQLException {

        /**
         *
         * mysql> desc admin;
         +-----------+-------------+------+-----+---------+-------+
         | Field     | Type        | Null | Key | Default | Extra |
         +-----------+-------------+------+-----+---------+-------+
         | aid       | int(11)     | NO   | PRI | NULL    |       |
         | aname     | varchar(50) | YES  |     | NULL    |       |
         | agender   | varchar(10) | YES  |     | NULL    |       |
         | apassword | varchar(30) | YES  |     | NULL    |       |
         +-----------+-------------+------+-----+---------+-------+
         *
         * */


        String aname = resultSet.getString("aname");
        String apassword = resultSet.getString("apassword");

        JdbcDaoAdmin JdbcdaoAdmin = new JdbcDaoAdmin();

        JdbcdaoAdmin.setAname(aname);
        JdbcdaoAdmin.setApassword(apassword);

        return JdbcdaoAdmin;
    }
}
