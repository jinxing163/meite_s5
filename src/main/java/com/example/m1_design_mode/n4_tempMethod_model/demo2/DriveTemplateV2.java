package com.example.m1_design_mode.n4_tempMethod_model.demo2;

/**
 * 模板抽象类
 * 可变的部分定义为抽象方法，不变的部分
 *
 * 1. 打开车门（摩托车没有车门，可变部分）
 * 2. 启动发动机（不变部分）
 * 3. 挂档（汽车用手挂档，摩托车用脚挂档，可变部分）
 * 4. 走起（不变部分）
 * 5. 刹车（汽车用脚刹车，摩托车用手刹车，可变部分）
 * 6. 停车（不变部分）
 *
 * @author JinXing
 * @date 2019/8/8 17:31
 */
public abstract class DriveTemplateV2 {

    /**
     * 定义开车的方法步骤
     */
    public final void drive() {

        // 1. 打开车门（摩托车没有车门，可变部分）
        this.openDoor();

        // 2. 启动发动机（不变部分）
        this.startEngine();

        // 3. 挂档（汽车用手挂档，摩托车用脚挂档，可变部分）
        this.gear();

        // 4. 走起（不变部分）
        this.go();

        // 5. 刹车（汽车用脚刹车，摩托车用手刹车，可变部分）
        this.brake();

        // 6. 停车（不变部分）
        this.stop();
    }


    /**
     * 1. 打开车门（摩托车没有车门，可变部分）
     */
    protected abstract void openDoor();

    /**
     * 2. 启动发动机（不变部分）
     */
    private void startEngine() {
        System.out.println("第二步：启动发动机...............");
    }

    /**
     * 3. 挂档（汽车用手挂档，摩托车用脚挂档，可变部分）
     */
    protected abstract void gear();

    /**
     * 4. 走起（不变部分）
     */
    private void go() {
        System.out.println("第四步：走起...............");
    }

    /**
     * 5. 刹车（汽车用脚刹车，摩托车用手刹车，可变部分）
     */
    protected abstract void brake();

    /**
     * 6. 停车（不变部分）
     */
    private void stop() {
        System.out.println("第六步：停车...............");
    }


    /**
     * 娱乐属性定义
     */
    private boolean haveMp3=false;
    private boolean haveMp4=false;
    private boolean haveVideo=false;

    /**
     * 娱乐的属性设置方法
     */
    protected void pastimeProperty(boolean haveMp3,boolean haveMp4,boolean haveVideo){
        this.haveMp3=haveMp3;
        this.haveMp4=haveMp4;
        this.haveVideo=haveVideo;
    }

    /**
     * 娱乐方法
     */
    public final void pastime(){

        if(haveMp3) {
            this.mp3();
        }

        if(haveMp4) {
            this.mp4();
        }

        if(haveVideo) {
            this.video();
        }
    }

    /**
     * 听mp3
     */
    protected void mp3(){
        System.out.println("###################### MP3 ######################");
    }

    /**
     * 听mp4
     */
    protected void mp4(){
        System.out.println("###################### MP4 ######################");
    }

    /**
     * 看video
     */
    protected void video(){
        System.out.println("###################### VIDEO ######################");
    }

}
