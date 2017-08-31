package cn.web.service;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created by Dw.L on 2017/4/30.
 */
public class Enhance {

    public void Engry(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("我是环绕增强的第一个");
        proceedingJoinPoint.proceed();
        System.out.println("我是环绕增强的第二个");
    }
}
