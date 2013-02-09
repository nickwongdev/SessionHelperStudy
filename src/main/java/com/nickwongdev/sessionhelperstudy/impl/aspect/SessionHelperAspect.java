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
    @Around(value = "aopSessionHelper_SetterPointcut")
    public void setterAdvice() {
        System.out.println("Setter advice called!");
    }
    
    
    @Pointcut("execution(public AopSessionHelper * set*)")
    public void aopSessionHelper_SetterPointcut() { }
}
