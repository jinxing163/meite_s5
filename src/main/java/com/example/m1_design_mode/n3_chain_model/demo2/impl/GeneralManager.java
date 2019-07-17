package com.example.m1_design_mode.n3_chain_model.demo2.impl;

import com.example.m1_design_mode.n3_chain_model.demo2.BaseApprovalHandler;

/**
 * 总经理
 * @author JinXing
 * @date 2019/7/17 10:35
 */
public class GeneralManager extends BaseApprovalHandler {


    public GeneralManager(BaseApprovalHandler baseApprovalHandler) {
        this.baseApprovalHandler = baseApprovalHandler;
    }

    @Override
    public void handlerRequest(int money) {

        //最大审批额度
        int maxMoney=50000;

        if(money <=maxMoney){
            System.out.println("我是"+this.getClass().getSimpleName()+"，正在审批金额 money="+money);
        }else {
            System.out.println("我是"+this.getClass().getSimpleName()+"，金额过大无法审批 money="+money);

            //传递请求
            transferRequest(money);
        }

    }
}
