package com.example.m1_design_mode.n2_decorate_model.combat.factory;

import com.example.m1_design_mode.n2_decorate_model.combat.component.Car;
import com.example.m1_design_mode.n2_decorate_model.combat.component.Taxi;
import com.example.m1_design_mode.n2_decorate_model.combat.decorator.impl.ByBus;
import com.example.m1_design_mode.n2_decorate_model.combat.decorator.impl.CallTaxi;
import com.example.m1_design_mode.n2_decorate_model.combat.decorator.impl.PayMoney;
import com.example.m1_design_mode.n2_decorate_model.combat.decorator.impl.Wait;

/**
 * @author JinXing
 * @date 2019/7/15 22:54
 */
public class TaxiFactory {

    /**出租车工厂控制出租车工作顺序*/
    public static Taxi geTaxi(){
        //执行顺序 Car.driving() -> CallTaxi.driving()-> Wait.driving()-> ByBus.driving()-> PayMoney.driving()
        return new PayMoney(new ByBus(new Wait(new CallTaxi(new Car()))));
    }

}
