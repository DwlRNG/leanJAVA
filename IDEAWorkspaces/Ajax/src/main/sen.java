package main;

/**
 * Created by Dw.L on 2017/4/27.
 */
public class sen {




    /**
     *
     * mysql> desc sen;
     +--------+-------------+------+-----+---------+-------+
     | Field  | Type        | Null | Key | Default | Extra |
     +--------+-------------+------+-----+---------+-------+
     | number | int(11)     | YES  |     | NULL    |       |
     | name   | varchar(30) | YES  |     | NULL    |       |
     +--------+-------------+------+-----+---------+-------+
     *
     */
    int number;
    String name;


    public sen(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public sen(){

    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }





}
