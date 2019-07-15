package com.example.m1_design_mode.n2_decorate_model.demo1.decorator;

import com.example.m1_design_mode.n2_decorate_model.demo1.componet.BaseComponent;

/**
 * @author JinXing
 * @date 2019/7/15 15:25
 */
public abstract class AbstractDecorator extends BaseComponent {

    protected BaseComponent baseGateWayComponent;

    @Override
    public void service() {
        baseGateWayComponent.service();
    }

    public abstract void setBaseGateWayComponent(BaseComponent baseGateWayComponent);
}
