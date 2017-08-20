package Classloader.ClassloaderFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by Dw.L on 2017/8/7.
 */
public class ClassloaderFactory {

    private Object targetObject;      //目标对象 需要增强的对象

    private beforeAdvice beforeAdvice;   //前置增强方法

    private afterAdvice afterAdvice;     //后置增强方法



    public Object createProxy(){         //得到代理对象


        ClassLoader loader = this.getClass().getClassLoader();

        Class[] interfaces = targetObject.getClass().getInterfaces();  //通过getClass().getInterfaces()方法得到目标对象

        InvocationHandler handler = new InvocationHandler(){
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                if (beforeAdvice != null){
                    beforeAdvice.beforeAdvicesay();
                }

                Object result = method.invoke(targetObject, args);


                if (afterAdvice != null) {

                    afterAdvice.afterAdvicesay();
                }
                return result;
            }
        };


        Object ProxyObject = Proxy.newProxyInstance(loader, interfaces, handler);

        return ProxyObject;
    }








    public Object getTargetObject() {
        return targetObject;
    }

    public void setTargetObject(Object targetObject) {
        this.targetObject = targetObject;
    }

    public Classloader.ClassloaderFactory.beforeAdvice getBeforeAdvice() {
        return beforeAdvice;
    }

    public void setBeforeAdvice(Classloader.ClassloaderFactory.beforeAdvice beforeAdvice) {
        this.beforeAdvice = beforeAdvice;
    }

    public Classloader.ClassloaderFactory.afterAdvice getAfterAdvice() {
        return afterAdvice;
    }

    public void setAfterAdvice(Classloader.ClassloaderFactory.afterAdvice afterAdvice) {
        this.afterAdvice = afterAdvice;
    }
}
