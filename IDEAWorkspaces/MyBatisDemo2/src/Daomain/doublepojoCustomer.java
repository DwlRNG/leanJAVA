package Daomain;

/**
 * Created by Dw.L on 2017/6/20.
 *
 * 这个类是 doubleTable 的扩展类
 *
 * 这里有表 home 与 表sex  的属性
 *
 *
 */
public class doublepojoCustomer extends doubleTable {

    /**
     *

     mysql> desc home;
     +-------+--------------+------+-----+---------+-------+
     | Field | Type         | Null | Key | Default | Extra |
     +-------+--------------+------+-----+---------+-------+
     | id    | int(11)      | NO   | PRI | NULL    |       |
     | city  | varchar(500) | YES  |     | NULL    |       |
     +-------+--------------+------+-----+---------+-------+

     * */

    private String city;
    private String sex_sex;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public String getSex_sex() {
        return sex_sex;
    }

    public void setSex_sex(String sex) {
        this.sex_sex = sex;
    }
}
