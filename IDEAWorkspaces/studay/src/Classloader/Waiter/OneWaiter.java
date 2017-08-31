package Classloader.Waiter;

/**
 * Created by Dw.L on 2017/8/7.
 */
public class OneWaiter implements Waiter {
    @Override
    public void serve() {
        System.out.println("我是一号服务员");
    }
}
