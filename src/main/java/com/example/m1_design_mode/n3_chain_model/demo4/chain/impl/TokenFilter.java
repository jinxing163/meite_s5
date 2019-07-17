package com.example.m1_design_mode.n3_chain_model.demo4.chain.impl;

import com.example.m1_design_mode.n3_chain_model.demo4.chain.BaseFilterHandler;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

/**
 * token校验拦截器
 *
 * @author JinXing
 * @date 2019/7/17 15:42
 */
public class TokenFilter extends BaseFilterHandler {

    private final String ckToken = "123";

    public TokenFilter(BaseFilterHandler baseFilterHandler) {
        this.baseFilterHandler = baseFilterHandler;
    }

    @Override
    public void handlerRequest(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

        //token校验->校验完token调用下家

        HttpServletResponse httpServletResponse = (HttpServletResponse) response;
        System.out.println("\n token校验拦截器..................");

        //获取请求参数
        boolean isNext = false;
        Map<String, String[]> parameterMap = request.getParameterMap();
        if (parameterMap.size() > 0) {

            String[] tokens = parameterMap.get("token");
            if (tokens.length > 0) {
                for (String token : tokens) {
                    if (StringUtils.isNotEmpty(token) && ckToken.equals(token)) {
                        isNext = true;
                    }
                }
            }
        }


        if (isNext) {

            //请求传递给下家
            transferRequest(request, response, chain);

            chain.doFilter(request, response);

        } else {
            //这句话的意思，是让浏览器用utf8来解析返回的数据
            httpServletResponse.setHeader("Content-type", "text/html;charset=UTF-8");
            //这句话的意思，是告诉servlet用UTF-8转码，而不是用默认的ISO8859
            httpServletResponse.setCharacterEncoding("UTF-8");

            String printStr="无效的token";
            httpServletResponse.getWriter().print(printStr);
            System.out.println(printStr);
        }

    }
}
