package Classloader;

import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Dw.L on 2017/8/7.
 */
public class Demo1 {


    @Test

    public void fun1(){



        ClassLoader loader = this.getClass().getClassLoader();  //利用当前类得到类加载器

        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println("你好动态代理！！！！");
                return null;
            }
        };

        Object object = Proxy.newProxyInstance(loader,new Class[]{A.class,B.class},handler);

        A a = (A) object;
        B b = (B) object;


        a.Asay();
        b.Bsay();


    }


}
