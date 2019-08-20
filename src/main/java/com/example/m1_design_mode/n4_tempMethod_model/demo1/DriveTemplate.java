package com.example.m1_design_mode.n4_tempMethod_model.demo1;

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
public abstract class DriveTemplate {

    /**
     * 定义开车的方法步骤
     */
    public final void drive() {

        // 1. 打开车门（摩托车没有车门，可变部分）
        openDoor();

        // 2. 启动发动机（不变部分）
        startEngine();

        // 3. 挂档（汽车用手挂档，摩托车用脚挂档，可变部分）
        gear();

        // 4. 走起（不变部分）
        go();

        // 5. 刹车（汽车用脚刹车，摩托车用手刹车，可变部分）
        brake();

        // 6. 停车（不变部分）
        stop();
    }


    /**
     * 1. 打开车门（摩托车没有车门，可变部分）
     */
    protected abstract void openDoor();

    /**
     * 2. 启动发动机（不变部分）
     */
    protected void startEngine() {
        System.out.println("第二步：启动发动机...............");
    }

    /**
     * 3. 挂档（汽车用手挂档，摩托车用脚挂档，可变部分）
     */
    protected abstract void gear();

    /**
     * 4. 走起（不变部分）
     */
    protected void go() {
        System.out.println("第四步：走起...............");
    }

    /**
     * 5. 刹车（汽车用脚刹车，摩托车用手刹车，可变部分）
     */
    protected abstract void brake();

    /**
     * 6. 停车（不变部分）
     */
    protected void stop() {
        System.out.println("第六步：停车...............");
    }

}
