package daomain;

/**
 * Created by Dw.L on 2017/6/12.
 */
public class pagingstudents {

    /**
     *
     *
     * mysql> desc pagingstudents;
     +---------+-------------+------+-----+---------+-------+
     | Field   | Type        | Null | Key | Default | Extra |
     +---------+-------------+------+-----+---------+-------+
     | num     | int(11)     | NO   | PRI | NULL    |       |
     | name    | varchar(50) | YES  |     | NULL    |       |
     | home_id | int(11)     | YES  | MUL | NULL    |       |
     +---------+-------------+------+-----+---------+-------+
     3 rows in set (0.01 sec)
     *
     *
     *
     */

    private int num;
    private String name;
    private int home_id;
    private String adderse;



    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHome_id() {
        return home_id;
    }

    public void setHome_id(int home_id) {
        this.home_id = home_id;
    }

    public String getAdderse() {
        return adderse;
    }

    public void setAdderse(String adderse) {
        this.adderse = adderse;
    }





}
