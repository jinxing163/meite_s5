package com.example.m1_design_mode.n3_chain_model.demo4.conf;

import com.example.m1_design_mode.n3_chain_model.demo4.filter.BaseFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author JinXing
 * @date 2019/7/17 13:52
 */
@Configuration
public class BaseFilterConfig {
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new BaseFilter());
        bean.addUrlPatterns("/*");
        return bean;
    }
}
