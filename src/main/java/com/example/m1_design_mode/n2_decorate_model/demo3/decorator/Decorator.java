package com.example.m1_design_mode.n2_decorate_model.demo3.decorator;

import com.example.m1_design_mode.n2_decorate_model.demo3.component.Component;

/**
 * @author JinXing
 * @date 2019/7/15 22:24
 */
public abstract class Decorator implements Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void service() {
        component.service();
    }
}
