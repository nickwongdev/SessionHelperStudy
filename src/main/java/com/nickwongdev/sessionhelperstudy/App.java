package com.nickwongdev.sessionhelperstudy;

import com.nickwongdev.sessionhelperstudy.data.Alpha;
import com.nickwongdev.sessionhelperstudy.impl.aspect.AopSessionHelper;
import javax.servlet.http.HttpServletRequest;
import org.springframework.mock.web.MockHttpServletRequest;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        App a = new App();
        a.testAop();
    }
    
    public void testAop() {
        
        HttpServletRequest request = new MockHttpServletRequest();
        AopSessionHelper aopSession = new AopSessionHelper();
        aopSession.setAlpha(request, new Alpha());
        aopSession.isSetAlpha(request);
        aopSession.getAlpha(request);
        aopSession.clearAlpha(request);
    }
}
