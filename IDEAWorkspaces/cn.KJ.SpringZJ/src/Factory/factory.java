package Factory;

import org.junit.Test;

/**
 * Created by Dw.L on 2017/5/13.
 */
public class factory {

    public static phone getphone(int i){

        phone phone =null;

        if(i==1){
            return phone = new  meizu();
        }
        if(i==2){
            return phone = new iphone();
        }
        return phone;

    }


    @Test
    public void test(){

        phone phone = factory.getphone(factorytype.iphone);

        phone.imessage();

    }


}
