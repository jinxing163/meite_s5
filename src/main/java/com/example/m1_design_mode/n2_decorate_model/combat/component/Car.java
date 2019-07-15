package com.example.m1_design_mode.n2_decorate_model.combat.component;

/**
 * @author JinXing
 * @date 2019/7/15 22:42
 */
public class Car implements Taxi {

    public Car() {
    }

    @Override
    public void driving() {
        //每个小汽车开之前都有一些准备工作，点火、踩离合、挂挡、松手刹...
        System.out.println("第一步准备工作：点火、踩离合、挂挡、松手刹...");
    }
}
