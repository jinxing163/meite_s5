package com.example.m1_design_mode.n3_chain_model.demo4.facotory;

import com.example.m1_design_mode.n3_chain_model.demo4.chain.BaseFilterHandler;
import com.example.m1_design_mode.n3_chain_model.demo4.chain.impl.LogRecord;
import com.example.m1_design_mode.n3_chain_model.demo4.chain.impl.TokenAuth;


/**
 * @author JinXing
 * @date 2019/7/17 15:44
 */
public class BaseFilterFactory {

    public static BaseFilterHandler getBaseFilterHandler(){
        return new TokenAuth(new LogRecord(null));
    }

}
