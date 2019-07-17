package com.example.m1_design_mode.n3_chain_model.demo4.filter;

import com.example.m1_design_mode.n3_chain_model.demo4.chain.BaseFilterHandler;
import com.example.m1_design_mode.n3_chain_model.demo4.facotory.BaseFilterFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author JinXing
 * @date 2019/7/17 15:49
 */

@WebFilter(filterName = "baseFilter", urlPatterns = "/*")
public class BaseFilter implements Filter {

    private final List<String> passUrlList =new ArrayList<>(50);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        passUrlList.clear();
        passUrlList.add(".");
        passUrlList.add("/login");
        passUrlList.add("/jiankong");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        System.out.println("\n\n ========================= 执行自定义责任链拦截器 ========================= ");

        //获取请求URL
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        String requestURI = httpServletRequest.getRequestURI();
        if(passUrlList.size() >0){
            for (String url : passUrlList) {
                if (requestURI.contains(url)) {

                    System.out.println("url ="+requestURI +"放行！");

                    chain.doFilter(request, response);
                    return;
                }
            }
        }

        //执行自定义责任链拦截器
        BaseFilterHandler baseFilterHandler = BaseFilterFactory.getBaseFilterHandler();
        baseFilterHandler.handlerRequest(request,response,chain);

    }
}
