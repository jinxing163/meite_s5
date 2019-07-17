package com.example.m1_design_mode.n3_chain_model.demo4.chain.impl;

import com.example.m1_design_mode.n3_chain_model.demo4.chain.BaseFilterHandler;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 日志记录拦截器
 *
 * @author JinXing
 * @date 2019/7/17 15:38
 */
public class LogFilter extends BaseFilterHandler {

    public LogFilter(BaseFilterHandler baseFilterHandler) {
        this.baseFilterHandler = baseFilterHandler;
    }

    @Override
    public void handlerRequest(ServletRequest request, ServletResponse response,FilterChain chain) throws IOException, ServletException {


        System.out.println("\n 日志记录拦截器..................");

        //日志记录->记录完日志调用下家
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;


        //获取请求URL
        StringBuffer requestURL = httpServletRequest.getRequestURL();
        System.out.println("请求URL: requestURL=" + requestURL);

        //获取请求参数
        Map<String, String[]> parameterMap = request.getParameterMap();
        if (parameterMap.size() > 0) {

            Map<String, String> parameterMap2 = new HashMap<>(parameterMap.size());
            parameterMap.forEach((key, value) -> parameterMap2.put(key, Arrays.toString(value)));

            System.out.println("请求参数：parameterMap=" + parameterMap2);
        }


        //请求传递给下家
        transferRequest(request, response ,chain);

        chain.doFilter(request, response);
    }
}
