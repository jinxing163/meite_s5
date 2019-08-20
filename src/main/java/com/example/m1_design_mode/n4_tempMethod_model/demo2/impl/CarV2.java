package com.example.m1_design_mode.n4_tempMethod_model.demo2.impl;

import com.example.m1_design_mode.n4_tempMethod_model.demo2.DriveTemplateV2;

/**
 * 小汽车
 * @author JinXing
 * @date 2019/8/8 19:32
 */
public class CarV2 extends DriveTemplateV2 {

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

    @Override
    protected void mp3() {
        super.mp3();
        System.out.println("************* 小汽车可以听听MP3 *************");
    }

    @Override
    protected void mp4() {
        super.mp4();
        System.out.println("************* 小汽车可以听听MP4 *************");
    }

    @Override
    protected void video() {
        super.video();
        System.out.println("************* 小汽车可以看看VIDEO *************");
    }

    public CarV2() {
        this.pastimeProperty(true,true,true);
    }

    @Override
    protected void pastimeProperty(boolean haveMp3, boolean haveMp4, boolean haveVideo) {
        super.pastimeProperty(haveMp3, haveMp4, haveVideo);
    }
}
