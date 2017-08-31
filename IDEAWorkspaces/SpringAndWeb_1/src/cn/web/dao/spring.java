package cn.web.dao;

/**
 * Created by Dw.L on 2017/5/1.
 */
public class spring {


    @Override
    public String toString() {
        return "spring{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    private String id;
    private  String name;
    private  String age;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public void out(){
        System.out.println("name:"+name+"   age:"+age+"   id:"+id);

    }




}
