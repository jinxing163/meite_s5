package com.example.m1_design_mode.n2_decorate_model.demo1.decorator.impl;

import com.example.m1_design_mode.n2_decorate_model.demo1.componet.BaseComponent;
import com.example.m1_design_mode.n2_decorate_model.demo1.decorator.AbstractDecorator;

/**
 * @author JinXing
 * @date 2019/7/15 15:33
 */
public class LogDecorator extends AbstractDecorator {


    public LogDecorator() {
    }

    public LogDecorator(BaseComponent baseGateWayComponent) {
        this.baseGateWayComponent=baseGateWayComponent;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("第二步：日志记录");
    }

    @Override
    public void setBaseGateWayComponent(BaseComponent baseGateWayComponent) {
        this.baseGateWayComponent=baseGateWayComponent;
    }
}
