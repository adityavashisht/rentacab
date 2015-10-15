package com.indasil.rentacab.service;

import org.aspectj.lang.annotation.*;


/**
 * Created by vashishta on 10/15/15.
 */
@Aspect
public class RentLoggerAspect {

    // Where should this aspect be applied?
    //@Pointcut("within(com.indasil.rentacab.service..*)")
    @Pointcut("@annotation(Log)")
    public void loggerPointCut() {
    }

    // At what point of execution should this be applied
    // In this case for all methods, right before the method is invoked.
    @After(value = "loggerPointCut()")
    public void logAfter() {
        System.out.println("I was called after rent....");
    }


    @Before(value = "loggerPointCut()")
    public void logBefore() {
        System.out.println("I was called before rent....");
    }
}
