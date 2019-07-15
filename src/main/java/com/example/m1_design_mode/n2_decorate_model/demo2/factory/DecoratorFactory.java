package com.example.m1_design_mode.n2_decorate_model.demo2.factory;

import com.example.m1_design_mode.n2_decorate_model.demo2.component.BaseComponent;
import com.example.m1_design_mode.n2_decorate_model.demo2.component.impl.ConcreteComponent;
import com.example.m1_design_mode.n2_decorate_model.demo2.decorator.impl.DecoratorA;
import com.example.m1_design_mode.n2_decorate_model.demo2.decorator.impl.DecoratorB;

/**
 * @author JinXing
 * @date 2019/7/15 19:32
 */
public class DecoratorFactory {

    public static BaseComponent gateWayComponent(){
        return new DecoratorB(new DecoratorA(new ConcreteComponent()));
    }

}
