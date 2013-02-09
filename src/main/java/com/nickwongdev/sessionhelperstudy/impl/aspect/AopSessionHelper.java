/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nickwongdev.sessionhelperstudy.impl.aspect;

import com.nickwongdev.sessionhelperstudy.data.Alpha;
import com.nickwongdev.sessionhelperstudy.data.Beta;
import com.nickwongdev.sessionhelperstudy.data.Delta;
import com.nickwongdev.sessionhelperstudy.data.Epsilon;
import com.nickwongdev.sessionhelperstudy.data.Gamma;
import com.nickwongdev.sessionhelperstudy.data.SessionState;
import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author Nick
 */
public class AopSessionHelper {
    public void setUserId(HttpServletRequest request, String value) {};
    public String getUserId(HttpServletRequest request) { return null; };
    public void isSetUserId(HttpServletRequest request) {};
    public void clearUserId(HttpServletRequest request) {};
    
    public void setSessionState(HttpServletRequest request, SessionState value) {};
    public SessionState getSessionState(HttpServletRequest request) { return null; };
    public void isSetSessionState(HttpServletRequest request) {};
    public void clearSessionState(HttpServletRequest request) {};

    public void setAlpha(HttpServletRequest request, Alpha value) {};
    public Alpha getAlpha(HttpServletRequest request) { return null; };
    public void isSetAlpha(HttpServletRequest request) {};
    public void clearAlpha(HttpServletRequest request) {};

    public void setBeta(HttpServletRequest request, Beta value) {};
    public Beta getBeta(HttpServletRequest request) { return null; };
    public void isSetBeta(HttpServletRequest request) {};
    public void clearBeta(HttpServletRequest request) {};

    public void setGamma(HttpServletRequest request, Gamma value) {};
    public Gamma getGamma(HttpServletRequest request) { return null; };
    public void isSetGamma(HttpServletRequest request) {};
    public void clearGamma(HttpServletRequest request) {};

    public void setDelta(HttpServletRequest request, Delta value) {};
    public Delta getDelta(HttpServletRequest request) { return null; };
    public void isSetDelta(HttpServletRequest request) {};
    public void clearDelta(HttpServletRequest request) {};

    public void setEpsilon(HttpServletRequest request, Epsilon value) {};
    public Epsilon getEpsilon(HttpServletRequest request) { return null; };
    public void isSetEpsilon(HttpServletRequest request) {};
    public void clearEpsilon(HttpServletRequest request) {};

    public void setZeta(HttpServletRequest request, Delta value) {};
    public Delta getZeta(HttpServletRequest request) { return null; };
    public void isSetZeta(HttpServletRequest request) {};
    public void clearZeta(HttpServletRequest request) {};
}
