package cn.KJ.Daomian;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Dw.L on 2017/4/30.
 */
public class Before {

    public void Bforesay(){

        System.out.println("我是前置增强的方法");
    }


    public  void afterBforesay(){
        System.out.println("我是后置增强的方法");
    }



    public void aroundforesay(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {  //ProceedingJoinPoint 可以调用需要增强的方法

        System.out.println("我是环绕增强在需要增强的方法前执行的方法");

        proceedingJoinPoint.proceed();   //可以有返回值

        System.out.println("我是环绕增强在需要增强的方法后面执行的方法");

    }
}
