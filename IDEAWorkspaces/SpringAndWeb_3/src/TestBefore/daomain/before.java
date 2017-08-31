package TestBefore.daomain;

import org.springframework.stereotype.Component;

/**
 * Created by Dw.L on 2017/5/22.
 */

@Component("before")
public class before {

    String hh = "啊哈哈";
    public  String zhengqiangspeak(){

        System.out.println("++++++++++++");

        return hh;
    }




}
