package Db.login.Utils;


import org.junit.Test;

/**
 * Created by Dw.L on 2017/4/21.  草稿
 */
public class text {

    String conn = "adminwww";

    @Test
    public void aaa() {
        if (conn.contains("admin")) {
            System.out.println("包含了admin");
        }else{
            System.out.println("GG");
        }
    }


    @Test
    public void jude(){
        if(one()&&two()){
            System.out.println("可以的哟亲");

        }else {
            System.out.println("GG");
        }
    }


    public boolean one(){
        return true;
    }

    public  boolean two(){
        return  true;
    }



    @Test
    public void jude1(){

        String s = "ss";


        if (s.contains("1")) {

            System.out.println("不是1");

        } else if (s.contains("2")) {

            System.out.println("不是2");

        } else if(s.contains("3")){

            System.out.println("不是3");

        } else if (s.contains("ss")){

            System.out.println("就是这里啦");
        }



    }

























}
