package com.example.m1_design_mode.n1_strategy_model.demo1;

import com.example.m1_design_mode.n1_strategy_model.demo1.content.PayContentStrategy;

/**
 * @author JinXing
 * @date 2019/6/3 17:15
 */
public class TestMain {


    public static void main(String[] args) {
        String payHtml = new PayContentStrategy().toPayHtml("aliPay");
        System.out.println(payHtml);
    }

}

