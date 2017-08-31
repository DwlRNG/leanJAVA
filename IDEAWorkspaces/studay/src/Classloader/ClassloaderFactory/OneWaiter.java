package Classloader.ClassloaderFactory;

/**
 * Created by Dw.L on 2017/8/7.
 */
public class OneWaiter implements Waiter {

    @Override
    public void waitesay() {
        System.out.println("我是一号服务员  为您服务中");
    }

    public void money(){

        System.out.println("把钱拿出来");

    }

}
