package Classloader.Waiter;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Dw.L on 2017/8/7.
 */
public class TestWaiter {

    @Test

    public void fun1() {

        Waiter oneWaiter = new OneWaiter();

        ClassLoader loader = this.getClass().getClassLoader();
        Class[] interfaces = {Waiter.class};
        WaterInvocationHandler handler = new WaterInvocationHandler(oneWaiter);   //提供一个目标类  需要增强的类是实现了Waiter的类

        Waiter waiter = (Waiter) Proxy.newProxyInstance(loader, interfaces, handler);

        waiter.serve();

    }


  class WaterInvocationHandler implements InvocationHandler{
      private Waiter waiter;

      public WaterInvocationHandler(Waiter getwaiter){
          this.waiter = getwaiter;
      }

      @Override
      public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

          System.out.println("您好！");
          waiter.serve();
          System.out.println("再见！");
          return null;
      }
  }


}
