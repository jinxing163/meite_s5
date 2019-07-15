package com.example.m1_design_mode.n2_decorate_model.demo1;

import com.example.m1_design_mode.n2_decorate_model.demo1.componet.BaseComponent;

/**
 * @author JinXing
 * @date 2019/7/15 14:45
 */
public class TestMain {


    public static void main(String[] args) {
        BaseComponent baseGateWayComponent= FactoryGateway.gateWayComponent();
        baseGateWayComponent.service();

        System.out.println("============================================================");

        //构造方法调用
        BaseComponent baseGateWayComponent1= FactoryGateway.gateWayComponentV2();
        baseGateWayComponent1.service();

    }

}
