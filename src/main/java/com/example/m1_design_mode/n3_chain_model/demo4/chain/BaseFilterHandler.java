package com.example.m1_design_mode.n3_chain_model.demo4.chain;


import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author JinXing
 * @date 2019/7/17 15:27
 */
public abstract class BaseFilterHandler {

    /** 处理当前请求的责任对象 */
    protected BaseFilterHandler baseFilterHandler;

    /**
     * 处理请求
     *
     * @param request
     *         请求对象
     * @param response
     *         请求对象
     * @param chain
     *         决定拦截器是否执行
     *
     * @throws IOException
     *         io异常
     * @throws ServletException
     *         servlet异常
     */
    public abstract void handlerRequest(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException;

    /**
     * 将请求传递给下家
     *
     * @param request
     *         请求对象
     * @param response
     *         请求对象
     * @param chain
     *         决定拦截器是否执行
     *
     * @throws IOException
     *         io异常
     * @throws ServletException
     *         servlet异常
     */
    protected void transferRequest(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        //将请求传递给下家
        BaseFilterHandler baseFilter = getBaseFilterHandler();
        if (baseFilter != null) {
            baseFilter.handlerRequest(request, response, chain);
        }
    }


    public BaseFilterHandler getBaseFilterHandler() {
        return baseFilterHandler;
    }

    public void setBaseFilterHandler(BaseFilterHandler baseFilterHandler) {
        this.baseFilterHandler = baseFilterHandler;
    }
}
