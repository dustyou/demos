package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

//@WebFilter(value = "/*", dispatcherTypes = {DispatcherType.FORWARD, DispatcherType.REQUEST})
public class FilterDemo03 implements Filter {
    public void destroy() {
    }
    
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("filterDemo03......");
        chain.doFilter(req, resp);
    }
    
    public void init(FilterConfig config) throws ServletException {
    
    }
    
}
