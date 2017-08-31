package main;

/**
 * Created by Dw.L on 2017/4/27.
 */
public class si {




    /**
     * mysql> desc si;
     * +-------+-------------+------+-----+---------+-------+
     * | Field | Type        | Null | Key | Default | Extra |
     * +-------+-------------+------+-----+---------+-------+
     * | sen   | varchar(30) | YES  |     | NULL    |       |
     * | name  | varchar(30) | YES  |     | NULL    |       |
     * +-------+-------------+------+-----+---------+-------+
     */

    String sen;
    String name;

    public si(String sen, String name) {
        this.sen = sen;
        this.name = name;
    }

    public si(){}

    public String getSen() {
        return sen;
    }

    public void setSen(String sen) {
        this.sen = sen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
