package daomian;

/**
 * Created by Dw.L on 2017/6/9.
 */
public class baoxiu {



    /**
     *
     * mysql> desc baoxiu;
     +---------+--------------+------+-----+---------+-------+
     | Field   | Type         | Null | Key | Default | Extra |
     +---------+--------------+------+-----+---------+-------+
     | dorm    | varchar(15)  | YES  |     | NULL    |       |
     | mag     | varchar(500) | YES  |     | NULL    |       |
     | snmae   | varchar(50)  | YES  |     | NULL    |       |
     | snumber | varchar(30)  | YES  |     | NULL    |       |
     +---------+--------------+------+-----+---------+-------+
     *
     * */




    String dorm;
    String mag;
    String snmae;
    String snumber;

    public baoxiu(){}


    public baoxiu(String dorm, String mag, String snmae, String snumber) {
        this.dorm = dorm;
        this.mag = mag;
        this.snmae = snmae;
        this.snumber = snumber;
    }

    public String getDorm() {
        return dorm;
    }

    public void setDorm(String dorm) {
        this.dorm = dorm;
    }

    public String getMag() {
        return mag;
    }

    public void setMag(String mag) {
        this.mag = mag;
    }

    public String getSnmae() {
        return snmae;
    }

    public void setSnmae(String snmae) {
        this.snmae = snmae;
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }








}
