package com.example.m1_design_mode.n4_tempMethod_model.demo1.impl;

import com.example.m1_design_mode.n4_tempMethod_model.demo1.DriveTemplate;

/**
 * 小汽车
 * @author JinXing
 * @date 2019/8/8 19:32
 */
public class Car extends DriveTemplate {

    @Override
    protected void openDoor() {
        System.out.println("第一步：小汽车手动开门 或者 遥控开门 ");
    }

    @Override
    protected void gear() {
        System.out.println("第三步：小汽车手动挂挡");
    }

    @Override
    protected void brake() {
        System.out.println("第五步：小汽车用脚刹车");
    }

}
