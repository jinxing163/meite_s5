package com.example.m1_design_mode.n2_decorate_model.demo3;

import com.example.m1_design_mode.n2_decorate_model.demo3.component.Component;

/**
 * @author JinXing
 * @date 2019/7/15 22:31
 */
public class TestMain {


    public static void main(String[] args) {
        Component component = FactoryDecorator.getComponent();
        component.service();
    }

}
