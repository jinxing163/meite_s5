package com.example.m1_design_mode.n1_strategy_model.demo1.content;

import com.example.m1_design_mode.n1_strategy_model.demo1.PayStrategyService;
import com.example.m1_design_mode.n1_strategy_model.demo1.enums.PayEnumStrategy;
import com.example.m1_design_mode.n1_strategy_model.demo1.factory.StrategyFactory;
import org.springframework.util.StringUtils;

/**
 * @author JinXing
 * @date 2019/6/3 17:33
 */
public class PayContentStrategy {

    /** 跳转对应的支付页面 */
    public String toPayHtml(String payCode) {

        PayStrategyService payStrategyService;

        try {

            if (StringUtils.isEmpty(payCode)) {
                return "payCode不能为空";
            }

            PayEnumStrategy anEnum = PayEnumStrategy.getEnum(payCode);
            if (anEnum == null) {
                return "没有找到对应的支付方式！";
            }

            payStrategyService = StrategyFactory.getPayStrategy(anEnum);
            if (payStrategyService == null) {
                return "没有找到对应的支付方式";
            }

        } catch (Exception e) {
            return "异常信息为e=" + e;
        }

        return payStrategyService.toPayHtml();
    }

}
