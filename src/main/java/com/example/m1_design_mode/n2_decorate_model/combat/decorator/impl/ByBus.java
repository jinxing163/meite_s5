package com.example.m1_design_mode.n2_decorate_model.combat.decorator.impl;

import com.example.m1_design_mode.n2_decorate_model.combat.component.Taxi;
import com.example.m1_design_mode.n2_decorate_model.combat.decorator.Work;

/**
 * @author JinXing
 * @date 2019/7/15 22:47
 */
public class ByBus extends Work {

    public ByBus(Taxi taxi) {
        super(taxi);
    }

    @Override
    public void driving() {
        super.driving();
        System.out.println("第四步：坐上车了...");
    }
}
