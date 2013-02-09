/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nickwongdev.sessionhelperstudy.impl.generics;

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
public class GenericSessionHelper {
    public static final SessionVariable<String> UserId = new SessionVariable<String>(SessionKeys.USER_ID_KEY);
    public static final SessionVariable<SessionState> SessionState = new SessionVariable<SessionState>(SessionKeys.SESSION_STATE_KEY);
    public static final SessionVariable<Alpha> Alpha = new SessionVariable<Alpha>(SessionKeys.ALPHA_KEY);
    public static final SessionVariable<Beta> Beta = new SessionVariable<Beta>(SessionKeys.BETA_KEY);
    public static final SessionVariable<Gamma> Gamma = new SessionVariable<Gamma>(SessionKeys.GAMMA_KEY);
    public static final SessionVariable<Delta> Delta = new SessionVariable<Delta>(SessionKeys.DELTA_KEY);
    public static final SessionVariable<Epsilon> Epsilon = new SessionVariable<Epsilon>(SessionKeys.EPSILON_KEY);
    public static final SessionVariable<Zeta> Zeta = new SessionVariable<Zeta>(SessionKeys.ZETA_KEY);
    
    public static class SessionVariable<T> {
        private String key;
        
        public SessionVariable (String key) {
            this.key = key;
        }
        
        public T get(HttpServletRequest request) {
            return (T) WebUtils.getSessionAttribute(request, key);
        }
        
        public void set(HttpServletRequest request, T value) {
            WebUtils.setSessionAttribute(request, key, value);
        }
        
        public boolean isSet(HttpServletRequest request) {
            return (WebUtils.getSessionAttribute(request, key) != null);
        }
        
        public void clear(HttpServletRequest request) {
            WebUtils.setSessionAttribute(request, key, null);
        }
    }
}
