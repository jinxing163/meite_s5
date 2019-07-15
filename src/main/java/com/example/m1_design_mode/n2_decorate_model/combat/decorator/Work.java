package com.example.m1_design_mode.n2_decorate_model.combat.decorator;

import com.example.m1_design_mode.n2_decorate_model.combat.component.Taxi;

/**
 * @author JinXing
 * @date 2019/7/15 22:44
 */
public abstract class Work implements Taxi{

    private Taxi taxi;

    public Work(Taxi taxi) {
        this.taxi = taxi;
    }

    @Override
    public void driving() {
        taxi.driving();
    }
}
