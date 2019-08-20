package com.example.m1_design_mode.n4_tempMethod_model.demo2.impl;

import com.example.m1_design_mode.n4_tempMethod_model.demo2.DriveTemplateV2;

/**
 * 摩托车
 * @author JinXing
 * @date 2019/8/8 19:27
 */
public class MotorcycleV2 extends DriveTemplateV2 {

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

    @Override
    protected void mp3() {
        super.mp3();
        System.out.println("************* 摩托车可以听听MP3 *************");
    }

    public MotorcycleV2() {
        this.pastimeProperty(true,false,false);
    }

    @Override
    protected void pastimeProperty(boolean haveMp3, boolean haveMp4, boolean haveVideo) {
        super.pastimeProperty(haveMp3, haveMp4, haveVideo);
    }
}
