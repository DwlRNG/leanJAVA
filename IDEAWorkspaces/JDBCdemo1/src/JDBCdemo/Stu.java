package JDBCdemo;

/**
 * Created by Dw.L on 2017/4/12.
 */
public class Stu {
    String number;
    String name;
    int age;
    String gender;

    public Stu(String number, String name, int age, String gender) {
        this.number = number;
        this.name = name;
        this.age = age;
    }

    public Stu(){

    }



    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
