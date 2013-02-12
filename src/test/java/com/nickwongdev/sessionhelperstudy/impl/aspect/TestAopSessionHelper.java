/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nickwongdev.sessionhelperstudy.impl.aspect;

import javax.servlet.http.HttpServletRequest;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;

/**
 *
 * @author niwong
 */
public class TestAopSessionHelper {
    
    private static AopSessionHelper aopSessionHelper = new AopSessionHelper();
    
    @Test
    public void testAopSessionHelper() {
        
        HttpServletRequest request = new MockHttpServletRequest();
        
        aopSessionHelper.setAlpha(request, null);
    }
}
