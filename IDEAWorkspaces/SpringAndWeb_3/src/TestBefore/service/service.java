package TestBefore.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Dw.L on 2017/5/22.
 */

@Aspect
public class service {

    String hh;

    @Around(value = "execution(* TestBefore.daomain.before.zhengqiangspeak())")
    public void zhengqiangbefore(ProceedingJoinPoint point) throws Throwable {

        service.one();

       String hh  = (String) point.proceed();

        service.two(hh);

    }


    public static void one(){

        System.out.println("__________________");
    }


    public static void two(String hhh){

        System.out.println("__________________"+hhh);
    }

}
