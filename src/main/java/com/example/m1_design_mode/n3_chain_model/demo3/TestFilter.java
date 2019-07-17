package com.example.m1_design_mode.n3_chain_model.demo3;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * TestFilter
 *
 * Tomcat中的Filter就是采用了责任链的模式。
 * 创建一个Filter除了要在web.xml文件中作相应的配置以外，
 * 还需要实现 javax.servlet.Filter 接口
 *
 * @author JinXing
 * @date 2019/7/17 13:31
 */

@WebFilter(filterName = "testFilter", urlPatterns = "/*")
public class TestFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        String str = " 过滤器 " + this.getClass().getSimpleName();
        System.out.println(" =======================" + str + " init 初始化完成 =======================");
    }


    /**
     * 容器调用过滤器的<code>doFilter</code>方法
     * 每次通过一个请求/响应对时，由于a
     * 客户端在链的末尾请求资源。的FilterChain
     * 传入此方法允许过滤器传递请求和
     * 响应链中的下一个实体。
     * < p >
     * 此方法的典型实现如下
     * 模式:- < br >
     * 1。检查请求< br >
     * 2。可选地用自定义实现将请求对象包装为
     * 过滤输入过滤的内容或标题<br>
     * 3。可选地用自定义实现将响应对象包装到
     * 过滤输出过滤的内容或标题<br>
     * 4。使用</strong>调用链中的下一个实体
     * FilterChain对象(<code>chain.doFilter()</code>)， <br>
     * 4。b) <强>或</强>不将请求/响应对传递给
     * 过滤器链中的下一个实体来阻止请求处理<br>
     * 5。在调用next之后，直接在响应上设置头信息
     * 过滤器链中的实体。
     */

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {


        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

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


        chain.doFilter(request, response);
        String str = " 过滤器 " + this.getClass().getSimpleName();
        System.out.println(" =======================" + str + " doFilter =======================");
    }

    @Override
    public void destroy() {

        String str = " 过滤器 " + this.getClass().getSimpleName();
        System.out.println(" =======================" + str + " destroy 已经销毁 =======================");
    }
}
