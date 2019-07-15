package com.example.m1_design_mode.n2_decorate_model.demo3;

import com.example.m1_design_mode.n2_decorate_model.demo3.component.Component;
import com.example.m1_design_mode.n2_decorate_model.demo3.component.ConcreteComponent;
import com.example.m1_design_mode.n2_decorate_model.demo3.decorator.impl.DecoratorA;
import com.example.m1_design_mode.n2_decorate_model.demo3.decorator.impl.DecoratorB;

/**
 * @author JinXing
 * @date 2019/7/15 22:28
 */
public class FactoryDecorator {

    public static Component getComponent(){
        return new DecoratorB(new DecoratorA(new ConcreteComponent()));
    }

}
