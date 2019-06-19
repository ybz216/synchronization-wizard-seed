package com.jzt.sync.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * Created with IntelliJ IDEA
 *
 * @Author yushiwh
 * @Description token
 * @Date 2018-04-09
 * @Time 16:54
 */
public class JWTToken implements AuthenticationToken {
    private String token;

    public JWTToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
