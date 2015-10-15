package com.indasil.rentacab.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


/**
 * Created by vashishta on 10/15/15.
 */
@Aspect
public class RentLoggerAspect {

    // Where should this aspect be applied?
    @Pointcut("within(com.indasil.rentacab.service..*)")
    public void loggerPointCut() {
    }

    // At what point of execution should this be applied
    // In this case for all methods, right before the method is invoked.
    @Before(value = "loggerPointCut()")
    public void log() {
        System.out.println("I was called before rent....");
    }
}
