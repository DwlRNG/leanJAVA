package daomian;

/**
 * Created by Dw.L on 2017/6/2.
 */
public class wstudents {


    /**
     * wstudents的JAVABEN
     *
     * mysql> desc wstudents;
     +---------+-------------+------+-----+---------+-------+
     | Field   | Type        | Null | Key | Default | Extra |
     +---------+-------------+------+-----+---------+-------+
     | sname   | varchar(50) | YES  |     | NULL    |       |
     | sclass  | varchar(50) | YES  |     | NULL    |       |
     | snumber | varchar(50) | YES  |     | NULL    |       |
     | sphone  | varchar(50) | YES  |     | NULL    |       |
     | dorm    | varchar(50) | YES  |     | NULL    |       |
     | sgender | varchar(20) | YES  |     | NULL    |       |
     +---------+-------------+------+-----+---------+-------+
     *
     * */



    String sname;
    String sclass;
    String snumber;
    String sphone;
    String dorm;
    String sgender;


    public wstudents(String sname, String sclass, String snumber, String sphone, String dorm, String sgender) {
        this.sname = sname;
        this.sclass = sclass;
        this.snumber = snumber;
        this.sphone = sphone;
        this.dorm = dorm;
        this.sgender = sgender;
    }

    public wstudents(){

    }


    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass;
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public String getDorm() {
        return dorm;
    }

    public void setDorm(String dorm) {
        this.dorm = dorm;
    }

    public String getSgender() {
        return sgender;
    }

    public void setSgender(String sgender) {
        this.sgender = sgender;
    }










}
