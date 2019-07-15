package com.example.m1_design_mode.n1_strategy_model.combat.strategy.impl;

import com.example.m1_design_mode.n1_strategy_model.combat.strategy.PayStrategy;
import com.example.result.RemoteResult;
import org.springframework.stereotype.Service;

/**
 * 微信支付
 * @author JinXing
 * @date 2019/7/12 14:36
 */

@Service
public class WxPayStrategy implements PayStrategy {

    @Override
    public RemoteResult<String> toPayHtml() {

        System.out.println("现在采用的支付方式为：微信支付......");

        return null;
    }
}
