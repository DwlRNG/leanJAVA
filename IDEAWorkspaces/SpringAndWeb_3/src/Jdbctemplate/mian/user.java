package Jdbctemplate.mian;

/**
 * Created by Dw.L on 2017/5/22.
 */
public class user {


    public user(String name, String money, String number) {
        this.name = name;
        this.money = money;
        this.number = number;
    }

    public user(){

    }


    /**
     * mysql> desc spring3;
     +--------+-------------+------+-----+---------+-------+
     | Field  | Type        | Null | Key | Default | Extra |
     +--------+-------------+------+-----+---------+-------+
     | name   | varchar(50) | YES  |     | NULL    |       |
     | money  | varchar(50) | YES  |     | NULL    |       |
     | number | varchar(50) | YES  |     | NULL    |       |
     +--------+-------------+------+-----+---------+-------+
     * */


    String name;
    String money;
    String number;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }




}

