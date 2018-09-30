package org.hut.kkuser.filter;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Created by hutwanghui on 2018/9/21.
 * email:zjjhwanhui@163.com
 * qq:472860892
 */
@Component
@WebFilter(urlPatterns = {"/user"})
public class IDfilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("ID过滤器初始化");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("开始执行过滤器" + LocalDateTime.now());
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("结束执行过滤器" + LocalDateTime.now());
    }

    @Override
    public void destroy() {

    }
}
