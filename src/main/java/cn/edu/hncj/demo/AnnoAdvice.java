package cn.edu.hncj.demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

//参考书本第148页起
@Aspect
public class AnnoAdvice {
    @Pointcut("execution(* cn.edu.hncj.demo.Calculation.*(..))")
    public void pointcut(){
    }

    @Before(value = "pointcut()")
    public void before(JoinPoint point){
        System.out.println("方法开始执行");
    }

    @After(value = "pointcut()")
    public void after(JoinPoint point){
        System.out.println("方法执行完毕");
    }


}