package com.example.m1_design_mode.n2_decorate_model.combat;

import com.example.m1_design_mode.n2_decorate_model.combat.component.Taxi;
import com.example.m1_design_mode.n2_decorate_model.combat.factory.TaxiFactory;

/**
 * @author JinXing
 * @date 2019/7/15 22:59
 */
public class TestMain {


    public static void main(String[] args) {
        Taxi taxi = TaxiFactory.geTaxi();
        taxi.driving();
    }

}
