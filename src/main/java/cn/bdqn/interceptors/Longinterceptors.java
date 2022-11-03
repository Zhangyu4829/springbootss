package cn.bdqn.interceptors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName: Longinterceptors
 * @Description:
 * @Date: 2022-11-02 19:23:19
 * @Author: zhangyu
 */
@Configuration
public class Longinterceptors implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return false;
    }
}
