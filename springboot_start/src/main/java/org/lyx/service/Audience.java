package org.lyx.service;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class Audience {
    private Logger log = LoggerFactory.getLogger(Audience.class);
    /*@Pointcut("execution(* org.lyx.service.Performance.perform(..))")
    public void per(){}*/
    @Pointcut("execution(* org.lyx.service.Performance.perform(String)) && args(name)")
    public void pern(String name){}

    @Around("pern(name)")
    public void toWatch(ProceedingJoinPoint point, String name) throws Throwable {
        try{
            point.proceed();
            log.info(name + "上场了");
            log.info(name + "演出结束");
        }catch(Exception e){
            log.info("refund the money");
        }


    }
    //表演前 手机静音
    /*@Before("per()")
    public void sliencePhone(){
        System.out.println("slience cell Phone");
    }
    //表演中 clap
    @AfterReturning("execution(* org.lyx.service.Performance.perform(..))")
    public void clap(){
        System.out.println("clap clap clap");
    }
    @AfterThrowing("execution(* org.lyx.service.Performance.perform(..))")
    public void refund(){
        System.out.println("refund the money");
    }*/

    /*@Around("per()")
    public void watch(ProceedingJoinPoint point) throws Throwable {
        try{
            log.info("slience cell phone");
            point.proceed();
            log.info("clap clap clap");
        }catch (Exception e){
            log.info("refund the money");
        }
    }*/


}
