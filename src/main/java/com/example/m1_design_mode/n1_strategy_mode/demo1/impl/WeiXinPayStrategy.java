package com.example.m1_design_mode.n1_strategy_mode.demo1.impl;

import com.example.m1_design_mode.n1_strategy_mode.demo1.PayStrategyService;

/**
 * @author JinXing
 * @date 2019/6/3 17:13
 */
public class WeiXinPayStrategy implements PayStrategyService {

    @Override
    public String toPayHtml() {
        System.out.println("我是微信支付平台");
        return null;
    }
}
