package com.tongjiaqian.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class myAdvice {
    @Pointcut("execution(void com..aopService.*())")
    public void pointCut(){}

    @Around("pointCut()")
    public void AD(ProceedingJoinPoint pjp) throws Throwable {
        Signature signature = pjp.getSignature();
        long start = System.currentTimeMillis();
        for (int i=0;i<10000;i++){
            pjp.proceed();
        }
        long end = System.currentTimeMillis();
        System.out.println(signature.getName()+" Time is:"+(end-start));
    }
}
