package Factory;

/**
 * Created by Dw.L on 2017/5/13.
 */
public class  iphone extends phone {

    public void imessage() {
        System.out.println("我是iPhone发短信");
    }


    public void call() {
        System.out.println("我是ipone打电话");
    }

    public void net() {
        System.out.println("我是iPhone上网");
    }
}
