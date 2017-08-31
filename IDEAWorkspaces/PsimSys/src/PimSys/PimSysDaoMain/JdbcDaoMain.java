package PimSys.PimSysDaoMain;

import org.springframework.stereotype.Component;

/**
 * Created by Dw.L on 2017/6/4.
 */

@Component("jdbcDaoMain")
public class JdbcDaoMain {



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


    private String workid;
    private String workname;
    private String name;
    private String gender;
    private String phone;



    public JdbcDaoMain(String workid, String workname, String name, String gender, String phone) {
        this.workid = workid;
        this.workname = workname;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
    }

    public JdbcDaoMain(){

    }
    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid;
    }

    public String getWorkname() {
        return workname;
    }

    public void setWorkname(String workname) {
        this.workname = workname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }







}
