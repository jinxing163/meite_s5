package com.example.m1_design_mode.n2_decorate_model.demo3.decorator.impl;

import com.example.m1_design_mode.n2_decorate_model.demo3.component.Component;
import com.example.m1_design_mode.n2_decorate_model.demo3.decorator.Decorator;

/**
 * @author JinXing
 * @date 2019/7/15 22:25
 */
public class DecoratorA extends Decorator {

    public DecoratorA(Component component) {
        super(component);
    }

    @Override
    public void service() {
        super.service();
        System.out.println("我是装饰者A");
    }
}
