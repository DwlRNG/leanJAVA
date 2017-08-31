package Daomian;

/**
 * Created by Dw.L on 2017/7/13.
 */
public class User {

    String name;
    String home;
    String number;

    public User(String name, String home, String number) {
        this.name = name;
        this.home = home;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
