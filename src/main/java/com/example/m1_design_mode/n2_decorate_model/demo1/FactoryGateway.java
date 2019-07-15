package com.example.m1_design_mode.n2_decorate_model.demo1;

import com.example.m1_design_mode.n2_decorate_model.demo1.componet.BaseComponent;
import com.example.m1_design_mode.n2_decorate_model.demo1.componet.BasicComponentGateWay;
import com.example.m1_design_mode.n2_decorate_model.demo1.decorator.impl.LimitDecorator;
import com.example.m1_design_mode.n2_decorate_model.demo1.decorator.impl.LogDecorator;

/**
 * @author JinXing
 * @date 2019/7/15 18:28
 */
public class FactoryGateway {



    /** set方法实现接口顺序调用  */
    public static BaseComponent gateWayComponent(){

        //初始化
        LogDecorator logDecorator=new LogDecorator();
        BasicComponentGateWay basicComponentGateWay =new BasicComponentGateWay();

        //2.接口限流 ->执行之前调用日志
        LimitDecorator limitDecorator=new LimitDecorator();
        limitDecorator.setBaseGateWayComponent(logDecorator);

        //3.日志记录 ->执行之前调用基础配置
        logDecorator.setBaseGateWayComponent(basicComponentGateWay);

        return limitDecorator;
    }


    /** 构造方法实现接口顺序调用  */
    public static BaseComponent gateWayComponentV2() {

        //接口限流 ->执行之前调用日志->日志记录 ->执行之前调用基础配置

        return new LimitDecorator(new LogDecorator(new BasicComponentGateWay()));
    }


}
