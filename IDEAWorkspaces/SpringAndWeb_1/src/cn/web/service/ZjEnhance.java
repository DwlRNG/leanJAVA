package cn.web.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Dw.L on 2017/5/1.  通过注解增强Zjtest1的类
 */


@Aspect   //增强类的注解
public class ZjEnhance {

    @Around(value = "execution(* cn.web.dao.Zjtest1.Zjsay())")         //增强类的方法注解  就是要增强到被增强的方法中的那个方法
    //增强的方法 有 环绕 @Around @After 等几个
    public void ZjEnchancesay(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        System.out.println("通过注解环绕增强在被增强方法前执行------");

        proceedingJoinPoint.proceed();

        System.out.println("通过注解环绕增强在被增强方法后执行------");

    }
}
