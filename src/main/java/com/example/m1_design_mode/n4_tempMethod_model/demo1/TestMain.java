package com.example.m1_design_mode.n4_tempMethod_model.demo1;

import com.example.m1_design_mode.n4_tempMethod_model.demo1.impl.Car;
import com.example.m1_design_mode.n4_tempMethod_model.demo1.impl.Motorcycle;

/**
 * 首先定义一个开车的模板方法
 *
 * 开车有以下几个步骤，其中有些步骤是可变的，有些步骤是不变的
 * 1. 打开车门（摩托车没有车门，可变部分）
 * 2. 启动发动机（不变部分）
 * 3. 挂档（汽车用手挂档，摩托车用脚挂档，可变部分）
 * 4. 走起（不变部分）
 * 5. 刹车（汽车用脚刹车，摩托车用手刹车，可变部分）
 * 6. 停车（不变部分）
 *
 * @author JinXing
 * @date 2019/8/8 19:34
 */
public class TestMain {


    public static void main(String[] args) {

        System.out.println("\n\n ############## 我想要开小汽车 ############## ");
        DriveTemplate car=new Car();
        car.drive();


        System.out.println("\n\n ############## 我想要开摩托车 ############## ");
        DriveTemplate motorcycle=new Motorcycle();
        motorcycle.drive();

    }

}
