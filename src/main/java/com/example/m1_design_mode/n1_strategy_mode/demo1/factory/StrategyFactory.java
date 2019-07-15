package com.example.m1_design_mode.n1_strategy_mode.demo1.factory;

import com.example.m1_design_mode.n1_strategy_mode.demo1.PayStrategyService;
import com.example.m1_design_mode.n1_strategy_mode.demo1.enums.PayEnumStrategy;

/**
 * @author JinXing
 * @date 2019/6/4 9:39
 */
public class StrategyFactory {


    //使用策略工厂获取具体的实现

    public static PayStrategyService getPayStrategy(PayEnumStrategy payEnumStrategy) throws Exception {

        //获取枚举对象中的class地址
        if (payEnumStrategy == null) {
            throw new Exception("没有找到对应的支付方式！");
        }


        try {

            Class<?> classPath = payEnumStrategy.getClassPath();

            //java反射初始化类
            return (PayStrategyService) classPath.newInstance();

        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return null;
    }


}
