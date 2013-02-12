/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nickwongdev.sessionhelperstudy.impl.aspect;

import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

/**
 *
 * @author Nick
 */
@Aspect
public class SessionHelperAspect {
    @Around("aopSessionHelper_SetPointcut()")
    public void setAdvice() {
        System.out.println("Set advice called!");
    }
    /*
    @Around("aopSessionHelper_GetPointcut()")
    public Object getAdvice() {
        System.out.println("Get advice called!");
        return null;
    }*/

    @Around("aopSessionHelper_IsSetPointcut()")
    public boolean isSetAdvice() {
        System.out.println("IsSet advice called!");
        return false;
    }
    
    @Around("aopSessionHelper_ClearPointcut()")
    public void clearAdvice() {
        System.out.println("Clear advice called!");
    }

    @Pointcut("call(public void AopSessionHelper.set*(..))")
    public void aopSessionHelper_SetPointcut() { }

    // @Pointcut("call(public * AopSessionHelper.get*(..))")
    // public void aopSessionHelper_GetPointcut() { }

    @Pointcut("call(public boolean AopSessionHelper.isSet*(..))")
    public void aopSessionHelper_IsSetPointcut() { }

    @Pointcut("call(public void AopSessionHelper.clear*(..))")
    public void aopSessionHelper_ClearPointcut() { }
}
