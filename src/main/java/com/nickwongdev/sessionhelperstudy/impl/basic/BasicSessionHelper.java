/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nickwongdev.sessionhelperstudy.impl.basic;

import com.nickwongdev.sessionhelperstudy.SessionKeys;
import com.nickwongdev.sessionhelperstudy.data.Alpha;
import com.nickwongdev.sessionhelperstudy.data.Beta;
import com.nickwongdev.sessionhelperstudy.data.Delta;
import com.nickwongdev.sessionhelperstudy.data.Epsilon;
import com.nickwongdev.sessionhelperstudy.data.Gamma;
import com.nickwongdev.sessionhelperstudy.data.SessionState;
import com.nickwongdev.sessionhelperstudy.data.Zeta;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.util.WebUtils;

/**
 *
 * @author Nick
 */
public class BasicSessionHelper {
    public void setUserId(HttpServletRequest request, String value) {
        WebUtils.setSessionAttribute(request, SessionKeys.USER_ID_KEY, value);
    }

    public String getUserId(HttpServletRequest request) {
        return (String) WebUtils.getSessionAttribute(request, SessionKeys.USER_ID_KEY);
    }

    public boolean isSetUserId(HttpServletRequest request) {
        return (WebUtils.getSessionAttribute(request, SessionKeys.USER_ID_KEY) != null);
    }

    public void clearUserId(HttpServletRequest request) {
        WebUtils.setSessionAttribute(request, SessionKeys.USER_ID_KEY, null);
    }
    
    public void setSessionState(HttpServletRequest request, SessionState value) {
        WebUtils.setSessionAttribute(request, SessionKeys.SESSION_STATE_KEY, value);
    }

    public SessionState getSessionState(HttpServletRequest request) {
        return (SessionState) WebUtils.getSessionAttribute(request, SessionKeys.SESSION_STATE_KEY);
    }

    public boolean isSetSessionState(HttpServletRequest request) {
        return WebUtils.getSessionAttribute(request, SessionKeys.SESSION_STATE_KEY) != null;
    }

    public void clearSessionState(HttpServletRequest request) {
        WebUtils.setSessionAttribute(request, SessionKeys.SESSION_STATE_KEY, null);
    }

    public void setAlpha(HttpServletRequest request, Alpha value) {
        WebUtils.setSessionAttribute(request, SessionKeys.ALPHA_KEY, value);
    }

    public Alpha getAlpha(HttpServletRequest request) {
        return (Alpha) WebUtils.getSessionAttribute(request, SessionKeys.ALPHA_KEY);
    }

    public boolean isSetAlpha(HttpServletRequest request) {
        return (WebUtils.getSessionAttribute(request, SessionKeys.ALPHA_KEY) != null);
    }

    public void clearAlpha(HttpServletRequest request) {
        WebUtils.setSessionAttribute(request, SessionKeys.ALPHA_KEY, null);
    }

    public void setBeta(HttpServletRequest request, Beta value) {
        WebUtils.setSessionAttribute(request, SessionKeys.BETA_KEY, value);
    }

    public Beta getBeta(HttpServletRequest request) {
        return (Beta) WebUtils.getSessionAttribute(request, SessionKeys.BETA_KEY);
    }

    public boolean isSetBeta(HttpServletRequest request) {
        return (WebUtils.getSessionAttribute(request, SessionKeys.BETA_KEY) != null);
    }

    public void clearBeta(HttpServletRequest request) {
        WebUtils.setSessionAttribute(request, SessionKeys.BETA_KEY, null);
    }
    
    public void setGamma(HttpServletRequest request, Gamma value) {
        WebUtils.setSessionAttribute(request, SessionKeys.GAMMA_KEY, value);
    }

    public Gamma getGamma(HttpServletRequest request) {
        return (Gamma) WebUtils.getSessionAttribute(request, SessionKeys.GAMMA_KEY);
    }

    public boolean isSetGamma(HttpServletRequest request) {
        return (WebUtils.getSessionAttribute(request, SessionKeys.GAMMA_KEY) != null);
    }

    public void clearGamma(HttpServletRequest request) {
        WebUtils.setSessionAttribute(request, SessionKeys.GAMMA_KEY, null);
    }
    
    public void setDelta(HttpServletRequest request, Delta value) {
        WebUtils.setSessionAttribute(request, SessionKeys.DELTA_KEY, value);
    }

    public Delta getDelta(HttpServletRequest request) {
        return (Delta) WebUtils.getSessionAttribute(request, SessionKeys.DELTA_KEY);
    }

    public boolean isSetDelta(HttpServletRequest request) {
        return (WebUtils.getSessionAttribute(request, SessionKeys.DELTA_KEY) != null);
    }

    public void clearDelta(HttpServletRequest request) {
        WebUtils.setSessionAttribute(request, SessionKeys.DELTA_KEY, null);
    }
        
    public void setEpsilon(HttpServletRequest request, Epsilon value) {
        WebUtils.setSessionAttribute(request, SessionKeys.EPSILON_KEY, value);
    }

    public Epsilon getEpsilon(HttpServletRequest request) {
        return (Epsilon) WebUtils.getSessionAttribute(request, SessionKeys.EPSILON_KEY);
    }

    public boolean isSetEpsilon(HttpServletRequest request) {
        return (WebUtils.getSessionAttribute(request, SessionKeys.EPSILON_KEY) != null);
    }

    public void clearEpsilon(HttpServletRequest request) {
        WebUtils.setSessionAttribute(request, SessionKeys.EPSILON_KEY, null);
    }
    
    public void setZeta(HttpServletRequest request, Zeta value) {
        WebUtils.setSessionAttribute(request, SessionKeys.ZETA_KEY, value);
    }

    public Zeta getZeta(HttpServletRequest request) {
        return (Zeta) WebUtils.getSessionAttribute(request, SessionKeys.ZETA_KEY);
    }

    public boolean isSetZeta(HttpServletRequest request) {
        return (WebUtils.getSessionAttribute(request, SessionKeys.ZETA_KEY) != null);
    }

    public void clearZeta(HttpServletRequest request) {
        WebUtils.setSessionAttribute(request, SessionKeys.ZETA_KEY, null);
    }
}
