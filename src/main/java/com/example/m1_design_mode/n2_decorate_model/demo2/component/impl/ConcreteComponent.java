package com.example.m1_design_mode.n2_decorate_model.demo2.component.impl;

import com.example.m1_design_mode.n2_decorate_model.demo2.component.BaseComponent;

/**
 *
 * @author JinXing
 * @date 2019/7/15 19:14
 */
public class ConcreteComponent implements BaseComponent {

    public ConcreteComponent() {
    }

    @Override
    public void sampleOperation() {
        System.out.println("第一步：我是接口附加责任类！");
    }
}
