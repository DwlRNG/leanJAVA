package zsms;

import org.junit.Test;

/**
 * Created by Dw.L on 2017/5/20.
 */

public class test {

    iphone i = new iphone();

    pushphone p = new pushphone(i);

    @Test
    public void fun(){

        i.Amland();
        i.CUP();

        System.out.println("+++++++++++++");

        p.Amland();
        p.CUP();
    }

}
