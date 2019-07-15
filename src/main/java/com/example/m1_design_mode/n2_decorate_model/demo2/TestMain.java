package com.example.m1_design_mode.n2_decorate_model.demo2;

import com.example.m1_design_mode.n2_decorate_model.demo2.component.BaseComponent;
import com.example.m1_design_mode.n2_decorate_model.demo2.factory.DecoratorFactory;

/**
 * @author JinXing
 * @date 2019/7/15 19:38
 */
public class TestMain {


    public static void main(String[] args) {

        BaseComponent baseComponent = DecoratorFactory.gateWayComponent();
        baseComponent.sampleOperation();

    }

}
