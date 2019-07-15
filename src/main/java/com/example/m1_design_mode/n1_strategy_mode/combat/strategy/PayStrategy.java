package com.example.m1_design_mode.n1_strategy_mode.combat.strategy;

import com.example.result.RemoteResult;

/**
 * 支付策略接口
 * @author JinXing
 * @date 2019/7/12 13:58
 */
public interface PayStrategy {



    /**
     *
     * 选择支付方式
     * 支付宝
     * 微信
     * 银行卡
     * @return RemoteResult
     */
    RemoteResult<String> toPayHtml();


}
