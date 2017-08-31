package Spring_ioc_user;

/**
 * Created by Dw.L on 2017/4/28.
 */
public class Person {



    private  String  name;
    private  int age;
    private String phone;

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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
    public Person(){

    }

    public void out(){
        System.out.println("名字："+name+"   年龄:"+age+"   电话:"+phone);

    }


}
