package Daomain;

/**
 * Created by Dw.L on 2017/6/19.
 *
 * 表User1
 *
 */
public class User1 {


    /**
     *
     * +-------+--------------+------+-----+---------+-------+
     | Field | Type         | Null | Key | Default | Extra |
     +-------+--------------+------+-----+---------+-------+
     | id    | int(11)      | NO   | PRI | NULL    |       |
     | name  | varchar(500) | YES  |     | NULL    |       |
     | sex   | int(11)      | YES  | MUL | NULL    |       |
     | home  | int(11)      | YES  | MUL | NULL    |       |
     +-------+--------------+------+-----+---------+-------+

     * */

    private int id;
    private String name;
    private int sex;
    private int home;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getHome() {
        return home;
    }

    public void setHome(int home) {
        this.home = home;
    }


}
