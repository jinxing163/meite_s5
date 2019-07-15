package com.example.m1_design_mode.n2_decorate_model.demo2.decorator;

import com.example.m1_design_mode.n2_decorate_model.demo2.component.BaseComponent;

/**
 * @author JinXing
 * @date 2019/7/15 19:15
 */
public abstract class BaseDecorator implements BaseComponent {


    protected BaseComponent baseComponent;

    public BaseDecorator(BaseComponent baseComponent) {
        this.baseComponent = baseComponent;
    }

    @Override
    public void sampleOperation() {
        //调用构建的抽象方法，最终调用的是具体构建对应的方法
        baseComponent.sampleOperation();
    }
}
