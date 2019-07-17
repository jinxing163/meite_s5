package com.example.m1_design_mode.n3_chain_model.demo4.facotory;

import com.example.m1_design_mode.n3_chain_model.demo4.chain.BaseFilterHandler;
import com.example.m1_design_mode.n3_chain_model.demo4.chain.impl.LogFilter;
import com.example.m1_design_mode.n3_chain_model.demo4.chain.impl.TokenFilter;


/**
 * @author JinXing
 * @date 2019/7/17 15:44
 */
public class BaseFilterFactory {

    public static BaseFilterHandler getBaseFilterHandler(){
        return new TokenFilter(new LogFilter(null));
    }

}
