package Classloader.ClassloaderFactory;
import Classloader.Waiter.OneWaiter;
import org.junit.Test;

/**
 * Created by Dw.L on 2017/8/7.
 */
public class TestClassLoaderFactory {

    @Test
    public void fun1(){

        ClassloaderFactory factory = new ClassloaderFactory();
        factory.setTargetObject(new Classloader.ClassloaderFactory.OneWaiter());   //虽然导入包 但是会出现类型转换错误的异常

        factory.setBeforeAdvice(new beforeAdvice() {
            @Override
            public void beforeAdvicesay() {
                System.out.println("您好");
            }
        });


        factory.setAfterAdvice(new afterAdvice() {
            @Override
            public void afterAdvicesay() {
                System.out.println("再见");
            }
        });

        Waiter waiter = (Waiter) factory.createProxy();
        waiter.money();

    }



}
