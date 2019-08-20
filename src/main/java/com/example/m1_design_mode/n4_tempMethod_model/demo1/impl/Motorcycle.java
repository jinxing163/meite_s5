package com.example.m1_design_mode.n4_tempMethod_model.demo1.impl;

import com.example.m1_design_mode.n4_tempMethod_model.demo1.DriveTemplate;

/**
 * 摩托车
 * @author JinXing
 * @date 2019/8/8 19:27
 */
public class Motorcycle extends DriveTemplate {

    @Override
    protected void openDoor() {
        System.out.println("第一步：摩托车没有车门");
    }

    @Override
    protected void gear() {
        System.out.println("第三步：摩托车用脚挂挡");
    }

    @Override
    protected void brake() {
        System.out.println("第五步：摩托车可以用脚刹车 或者 手刹车");
    }

}
