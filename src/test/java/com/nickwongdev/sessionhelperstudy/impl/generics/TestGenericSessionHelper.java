/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nickwongdev.sessionhelperstudy.impl.generics;

import com.nickwongdev.sessionhelperstudy.data.Alpha;
import com.nickwongdev.sessionhelperstudy.data.Beta;
import com.nickwongdev.sessionhelperstudy.data.Delta;
import com.nickwongdev.sessionhelperstudy.data.Epsilon;
import com.nickwongdev.sessionhelperstudy.data.Gamma;
import com.nickwongdev.sessionhelperstudy.data.SessionState;
import com.nickwongdev.sessionhelperstudy.data.Zeta;
import javax.servlet.http.HttpServletRequest;
import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.util.Assert;

/**
 *
 * @author Nick
 */
public class TestGenericSessionHelper {

    @Test
    public void testGenericSessionHelper() {
        HttpServletRequest request = new MockHttpServletRequest();

        GenericSessionHelper genericSessionHelper = new GenericSessionHelper();

        // Test UserId
        String testUserId = "user-id-1234";
        Assert.isTrue(!genericSessionHelper.UserId.isSet(request));        // Assert that it isn't set when you start
        genericSessionHelper.UserId.set(request, testUserId); // Set it
        Assert.isTrue(genericSessionHelper.UserId.isSet(request)); // Assert that it is set, now that you set it
        Assert.isTrue(testUserId.equals(genericSessionHelper.UserId.get(request))); // Assert that it matches what you set it to 
        genericSessionHelper.UserId.clear(request); // Clear it
        Assert.isTrue(!genericSessionHelper.UserId.isSet(request)); // Assert that it isn't set now

        // Test SessionState
        SessionState testState = SessionState.LOGGED_IN;
        Assert.isTrue(!genericSessionHelper.SessionState.isSet(request));        // Assert that it isn't set when you start
        genericSessionHelper.SessionState.set(request, testState); // Set it
        Assert.isTrue(genericSessionHelper.SessionState.isSet(request)); // Assert that it is set, now that you set it
        Assert.isTrue(testState.equals(genericSessionHelper.SessionState.get(request))); // Assert that it matches what you set it to 
        genericSessionHelper.SessionState.clear(request); // Clear it
        Assert.isTrue(!genericSessionHelper.SessionState.isSet(request)); // Assert that it isn't set now

        // Test Alpha
        Alpha testAlpha = new Alpha();
        Assert.isTrue(!genericSessionHelper.Alpha.isSet(request));        // Assert that it isn't set when you start
        genericSessionHelper.Alpha.set(request, testAlpha); // Set it
        Assert.isTrue(genericSessionHelper.Alpha.isSet(request)); // Assert that it is set, now that you set it
        Assert.isTrue(testAlpha.equals(genericSessionHelper.Alpha.get(request))); // Assert that it matches what you set it to 
        genericSessionHelper.Alpha.clear(request); // Clear it
        Assert.isTrue(!genericSessionHelper.Alpha.isSet(request)); // Assert that it isn't set now

        // Test Beta
        Beta testBeta = new Beta();
        Assert.isTrue(!genericSessionHelper.Beta.isSet(request));        // Assert that it isn't set when you start
        genericSessionHelper.Beta.set(request, testBeta); // Set it
        Assert.isTrue(genericSessionHelper.Beta.isSet(request)); // Assert that it is set, now that you set it
        Assert.isTrue(testBeta.equals(genericSessionHelper.Beta.get(request))); // Assert that it matches what you set it to 
        genericSessionHelper.Beta.clear(request); // Clear it
        Assert.isTrue(!genericSessionHelper.Beta.isSet(request)); // Assert that it isn't set now
    
        // Test Gamma
        Gamma testGamma = new Gamma();
        Assert.isTrue(!genericSessionHelper.Gamma.isSet(request));        // Assert that it isn't set when you start
        genericSessionHelper.Gamma.set(request, testGamma); // Set it
        Assert.isTrue(genericSessionHelper.Gamma.isSet(request)); // Assert that it is set, now that you set it
        Assert.isTrue(testGamma.equals(genericSessionHelper.Gamma.get(request))); // Assert that it matches what you set it to 
        genericSessionHelper.Gamma.clear(request); // Clear it
        Assert.isTrue(!genericSessionHelper.Gamma.isSet(request)); // Assert that it isn't set now
    
        // Test Delta
        Delta testDelta = new Delta();
        Assert.isTrue(!genericSessionHelper.Delta.isSet(request));        // Assert that it isn't set when you start
        genericSessionHelper.Delta.set(request, testDelta); // Set it
        Assert.isTrue(genericSessionHelper.Delta.isSet(request)); // Assert that it is set, now that you set it
        Assert.isTrue(testDelta.equals(genericSessionHelper.Delta.get(request))); // Assert that it matches what you set it to 
        genericSessionHelper.Delta.clear(request); // Clear it
        Assert.isTrue(!genericSessionHelper.Delta.isSet(request)); // Assert that it isn't set now
    
        // Test Epsilon
        Epsilon testEpsilon = new Epsilon();
        Assert.isTrue(!genericSessionHelper.Epsilon.isSet(request));        // Assert that it isn't set when you start
        genericSessionHelper.Epsilon.set(request, testEpsilon); // Set it
        Assert.isTrue(genericSessionHelper.Epsilon.isSet(request)); // Assert that it is set, now that you set it
        Assert.isTrue(testEpsilon.equals(genericSessionHelper.Epsilon.get(request))); // Assert that it matches what you set it to 
        genericSessionHelper.Epsilon.clear(request); // Clear it
        Assert.isTrue(!genericSessionHelper.Epsilon.isSet(request)); // Assert that it isn't set now
    
        // Test Zeta
        Zeta testZeta = new Zeta();
        Assert.isTrue(!genericSessionHelper.Zeta.isSet(request));        // Assert that it isn't set when you start
        genericSessionHelper.Zeta.set(request, testZeta); // Set it
        Assert.isTrue(genericSessionHelper.Zeta.isSet(request)); // Assert that it is set, now that you set it
        Assert.isTrue(testZeta.equals(genericSessionHelper.Zeta.get(request))); // Assert that it matches what you set it to 
        genericSessionHelper.Zeta.clear(request); // Clear it
        Assert.isTrue(!genericSessionHelper.Zeta.isSet(request)); // Assert that it isn't set now
    
    }
}
