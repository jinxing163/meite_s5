package com.example.m1_design_mode.n1_strategy_mode.combat.strategy.content;

import com.example.m1_design_mode.BaseTest;
import com.example.m1_design_mode.n1_strategy_mode.combat.strategy.enums.PaymentEnums;
import com.example.result.RemoteResult;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author JinXing
 * @date 2019/7/12 15:12
 */
public class PayStrategyContentTest extends BaseTest {

    @Autowired
    private PayStrategyContent payStrategyContent;

    @Test
    public void toPayHtml() {

        PaymentEnums paymentEnums=PaymentEnums.ALI_PAY;
        RemoteResult<String> stringRemoteResult = payStrategyContent.toPayHtml(paymentEnums);

        System.out.println(stringRemoteResult);

    }
}