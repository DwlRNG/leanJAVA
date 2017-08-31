package Benutios;

/**
 * Created by Dw.L on 2017/3/24.
 */
public class person {
    private  String name;
    private  int age;
    private  String gearn;



    public  person(){


    }

    public person(String name,int age,String gearn){
        this.gearn=gearn;
        this.age=age;
        this.name=name;

    }

    public String  getName(){
        return name;
    }

    public  int getAge(){
        return age;
    }

    public String getGearn(){

        return gearn;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGearn(){
        this.gearn=gearn;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
