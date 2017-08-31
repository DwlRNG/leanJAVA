package PimSys.PimSysDaoMain;

import org.springframework.stereotype.Component;

/**
 * Created by Dw.L on 2017/6/4.
 */

@Component("jdbcdaoAdmin")
public class JdbcDaoAdmin {




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

    private int aid;
    private String aname;
    private String agender;
    private String apassword;


    public JdbcDaoAdmin(int aid, String aname, String agender, String apassword) {
        this.aid = aid;
        this.aname = aname;
        this.agender = agender;
        this.apassword = apassword;
    }

    public JdbcDaoAdmin(){

    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAgender() {
        return agender;
    }

    public void setAgender(String agender) {
        this.agender = agender;
    }

    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }







}
