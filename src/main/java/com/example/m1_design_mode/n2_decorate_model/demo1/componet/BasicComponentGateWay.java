package com.example.m1_design_mode.n2_decorate_model.demo1.componet;

/**
 * @author JinXing
 * @date 2019/7/15 15:23
 */
public class BasicComponentGateWay extends BaseComponent {

    public BasicComponentGateWay() {
    }

    @Override
    public void service() {
        System.out.println("第一步：调用网管获取基本参数信息");
    }
}
