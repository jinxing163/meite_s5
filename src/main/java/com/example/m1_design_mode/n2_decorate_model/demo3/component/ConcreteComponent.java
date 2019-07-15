package com.example.m1_design_mode.n2_decorate_model.demo3.component;

/**
 * 定义一个将要接收附加责任的类
 * @author JinXing
 * @date 2019/7/15 22:21
 */
public class ConcreteComponent implements Component{

    public ConcreteComponent() {
    }

    @Override
    public void service() {
        System.out.println("我要接收附加责任");
    }
}
