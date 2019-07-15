package com.example.m1_design_mode.n2_decorate_model.demo2.decorator.impl;


import com.example.m1_design_mode.n2_decorate_model.demo2.component.BaseComponent;
import com.example.m1_design_mode.n2_decorate_model.demo2.decorator.BaseDecorator;

/**
 * @author JinXing
 * @date 2019/7/15 19:18
 */
public class DecoratorA extends BaseDecorator {


    public DecoratorA(BaseComponent baseComponent) {
        super(baseComponent);
    }

    @Override
    public void sampleOperation() {
        super.sampleOperation();
        System.out.println("第二步：我是装饰A");
    }
}
