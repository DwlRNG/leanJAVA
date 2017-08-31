package com.ambow.corejava.day01;

/**
 * Created by Dw.L on 2017/7/10.
 *
 *Concrete realization person
 */
public class dawei extends personAttribute{

    private void setAttribute(){

        this.setName("dawei");
        this.setHome("zhongguo-guizhou-zunyi");
        this.setPhone("182****9790");
        this.setWages(5300);
        this.setWork("Programmer");
        this.setYear(20);

    }

    public void Ability1(){         //重写能力 1

        System.out.println("我会煮饭");
    }

    public void Ability2(){
    /*懒得写了*/
    }

    public void Ability3(){
    /*懒得写了*/
    }

    public void SelfIntroduction(){ //自我介绍
        setAttribute();
        System.out.println(
                "姓名："+super.getName()+"   籍贯："+super.getHome()+"  工作："+super.getWork()+
                "   电话："+super.getPhone()+"   工资："+super.getWages()+"   年龄："+super.getYear()
        );

    }


}
