package Db.login.mian;

/**
 * Created by Dw.L on 2017/4/19.
 */
public class Students {


    /**
     +-----------+-------------+------+-----+---------+-------+
     | Field     | Type        | Null | Key | Default | Extra |
     +-----------+-------------+------+-----+---------+-------+
     | sid       | int(11)     | NO   | PRI | NULL    |       |
     | sname     | varchar(50) | YES  |     | NULL    |       |
     | sgender   | varchar(10) | YES  |     | NULL    |       |
     | smajor    | varchar(20) | YES  |     | NULL    |       |
     | sclass    | varchar(20) | YES  |     | NULL    |       |
     | shome     | varchar(50) | YES  |     | NULL    |       |
     | sphone    | varchar(20) | YES  |     | NULL    |       |
     | spassword | varchar(30) | YES  |     | NULL    |       |
     +-----------+-------------+------+-----+---------+-------+
     * */

    int    sid;
    String sname;
    String sgender;
    String smajor;
    String sclass;
    String shome;
    String sphone;
    String spassword;


    public Students(){

    }


    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }

    public String getSmajor() {
        return smajor;
    }

    public void setSmajor(String smajor) {
        this.smajor = smajor;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getShome() {
        return shome;
    }

    public void setShome(String shome) {
        this.shome = shome;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public String getSpassword() {
        return spassword;
    }

    public void setSpassword(String spassword) {
        this.spassword = spassword;
    }


    public Students(int sid, String sname, String sgender, String smajor, String sclass, String shome, String sphone, String spassword) {
        this.sid = sid;
        this.sname = sname;
        this.sgender = sgender;
        this.smajor = smajor;
        this.sclass = sclass;
        this.shome = shome;
        this.sphone = sphone;
        this.spassword = spassword;
    }
}
