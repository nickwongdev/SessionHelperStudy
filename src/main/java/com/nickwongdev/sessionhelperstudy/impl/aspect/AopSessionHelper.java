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
    public boolean isSetUserId(HttpServletRequest request) { return false; };
    public void clearUserId(HttpServletRequest request) {};
    
    public void setSessionState(HttpServletRequest request, SessionState value) {};
    public SessionState getSessionState(HttpServletRequest request) { return null; };
    public boolean isSetSessionState(HttpServletRequest request) { return false; };
    public void clearSessionState(HttpServletRequest request) {};

    public void setAlpha(HttpServletRequest request, Alpha value) {};
    public Alpha getAlpha(HttpServletRequest request) { return null; };
    public boolean isSetAlpha(HttpServletRequest request) { return false; };
    public void clearAlpha(HttpServletRequest request) {};

    public void setBeta(HttpServletRequest request, Beta value) {};
    public Beta getBeta(HttpServletRequest request) { return null; };
    public boolean isSetBeta(HttpServletRequest request) { return false; };
    public void clearBeta(HttpServletRequest request) {};

    public void setGamma(HttpServletRequest request, Gamma value) {};
    public Gamma getGamma(HttpServletRequest request) { return null; };
    public boolean isSetGamma(HttpServletRequest request) { return false; };
    public void clearGamma(HttpServletRequest request) {};

    public void setDelta(HttpServletRequest request, Delta value) {};
    public Delta getDelta(HttpServletRequest request) { return null; };
    public boolean isSetDelta(HttpServletRequest request) { return false; };
    public void clearDelta(HttpServletRequest request) {};

    public void setEpsilon(HttpServletRequest request, Epsilon value) {};
    public Epsilon getEpsilon(HttpServletRequest request) { return null; };
    public boolean isSetEpsilon(HttpServletRequest request) { return false; };
    public void clearEpsilon(HttpServletRequest request) {};

    public void setZeta(HttpServletRequest request, Delta value) {};
    public Delta getZeta(HttpServletRequest request) { return null; };
    public boolean isSetZeta(HttpServletRequest request) { return false; };
    public void clearZeta(HttpServletRequest request) {};
}
