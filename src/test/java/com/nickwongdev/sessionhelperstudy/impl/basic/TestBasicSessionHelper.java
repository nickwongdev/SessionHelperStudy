/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nickwongdev.sessionhelperstudy.impl.basic;

import com.nickwongdev.sessionhelperstudy.data.Alpha;
import com.nickwongdev.sessionhelperstudy.data.Beta;
import com.nickwongdev.sessionhelperstudy.data.Delta;
import com.nickwongdev.sessionhelperstudy.data.Epsilon;
import com.nickwongdev.sessionhelperstudy.data.Gamma;
import com.nickwongdev.sessionhelperstudy.data.SessionState;
import com.nickwongdev.sessionhelperstudy.data.Zeta;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.util.Assert;

/**
 *
 * @author Nick
 */
public class TestBasicSessionHelper {

    private static final BasicSessionHelper basicSessionHelper = new BasicSessionHelper();

    @Test
    public void testBasicSessionHelper() {
        HttpSession session = new MockHttpSession();
        HttpServletRequest request = new MockHttpServletRequest();

        // Test UserId
        String testUserId = "user-id-1234";
        Assert.isTrue(!basicSessionHelper.isSetUserId(request));        // Assert that it isn't set when you start
        basicSessionHelper.setUserId(request, testUserId); // Set it
        Assert.isTrue(basicSessionHelper.isSetUserId(request)); // Assert that it is set, now that you set it
        Assert.isTrue(testUserId.equals(basicSessionHelper.getUserId(request))); // Assert that it matches what you set it to 
        basicSessionHelper.clearUserId(request); // Clear it
        Assert.isTrue(!basicSessionHelper.isSetUserId(request)); // Assert that it isn't set now
        
        // Test SessionState
        SessionState testSessionState = SessionState.LOGGED_IN;
        Assert.isTrue(!basicSessionHelper.isSetSessionState(request));        // Assert that it isn't set when you start
        basicSessionHelper.setSessionState(request, testSessionState); // Set it
        Assert.isTrue(basicSessionHelper.isSetSessionState(request)); // Assert that it is set, now that you set it
        Assert.isTrue(testSessionState.equals(basicSessionHelper.getSessionState(request))); // Assert that it matches what you set it to 
        basicSessionHelper.clearSessionState(request); // Clear it
        Assert.isTrue(!basicSessionHelper.isSetSessionState(request)); // Assert that it isn't set now
        
        // Test Alpha
        Alpha testAlpha = new Alpha();
        Assert.isTrue(!basicSessionHelper.isSetAlpha(request));        // Assert that it isn't set when you start
        basicSessionHelper.setAlpha(request, testAlpha); // Set it
        Assert.isTrue(basicSessionHelper.isSetAlpha(request)); // Assert that it is set, now that you set it
        Assert.isTrue(testAlpha.equals(basicSessionHelper.getAlpha(request))); // Assert that it matches what you set it to 
        basicSessionHelper.clearAlpha(request); // Clear it
        Assert.isTrue(!basicSessionHelper.isSetAlpha(request)); // Assert that it isn't set now

        // Test Beta
        Beta testBeta = new Beta();
        Assert.isTrue(!basicSessionHelper.isSetBeta(request));        // Assert that it isn't set when you start
        basicSessionHelper.setBeta(request, testBeta); // Set it
        Assert.isTrue(basicSessionHelper.isSetBeta(request)); // Assert that it is set, now that you set it
        Assert.isTrue(testBeta.equals(basicSessionHelper.getBeta(request))); // Assert that it matches what you set it to 
        basicSessionHelper.clearBeta(request); // Clear it
        Assert.isTrue(!basicSessionHelper.isSetBeta(request)); // Assert that it isn't set now
        
        // Test Gamma
        Gamma testGamma = new Gamma();
        Assert.isTrue(!basicSessionHelper.isSetGamma(request));        // Assert that it isn't set when you start
        basicSessionHelper.setGamma(request, testGamma); // Set it
        Assert.isTrue(basicSessionHelper.isSetGamma(request)); // Assert that it is set, now that you set it
        Assert.isTrue(testGamma.equals(basicSessionHelper.getGamma(request))); // Assert that it matches what you set it to 
        basicSessionHelper.clearGamma(request); // Clear it
        Assert.isTrue(!basicSessionHelper.isSetGamma(request)); // Assert that it isn't set now

        // Test Epsilon
        Epsilon testEpsilon = new Epsilon();
        Assert.isTrue(!basicSessionHelper.isSetEpsilon(request));        // Assert that it isn't set when you start
        basicSessionHelper.setEpsilon(request, testEpsilon); // Set it
        Assert.isTrue(basicSessionHelper.isSetEpsilon(request)); // Assert that it is set, now that you set it
        Assert.isTrue(testEpsilon.equals(basicSessionHelper.getEpsilon(request))); // Assert that it matches what you set it to 
        basicSessionHelper.clearEpsilon(request); // Clear it
        Assert.isTrue(!basicSessionHelper.isSetEpsilon(request)); // Assert that it isn't set now

        // Test Delta
        Delta testDelta = new Delta();
        Assert.isTrue(!basicSessionHelper.isSetDelta(request));        // Assert that it isn't set when you start
        basicSessionHelper.setDelta(request, testDelta); // Set it
        Assert.isTrue(basicSessionHelper.isSetDelta(request)); // Assert that it is set, now that you set it
        Assert.isTrue(testDelta.equals(basicSessionHelper.getDelta(request))); // Assert that it matches what you set it to 
        basicSessionHelper.clearDelta(request); // Clear it
        Assert.isTrue(!basicSessionHelper.isSetDelta(request)); // Assert that it isn't set now

        // Test Zeta
        Zeta testZeta = new Zeta();
        Assert.isTrue(!basicSessionHelper.isSetZeta(request));        // Assert that it isn't set when you start
        basicSessionHelper.setZeta(request, testZeta); // Set it
        Assert.isTrue(basicSessionHelper.isSetZeta(request)); // Assert that it is set, now that you set it
        Assert.isTrue(testZeta.equals(basicSessionHelper.getZeta(request))); // Assert that it matches what you set it to 
        basicSessionHelper.clearZeta(request); // Clear it
        Assert.isTrue(!basicSessionHelper.isSetZeta(request)); // Assert that it isn't set now
    }
}
