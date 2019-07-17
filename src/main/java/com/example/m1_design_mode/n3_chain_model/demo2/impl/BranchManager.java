package com.example.m1_design_mode.n3_chain_model.demo2.impl;

import com.example.m1_design_mode.n3_chain_model.demo2.BaseApprovalHandler;

/**
 * 部门经理
 * @author JinXing
 * @date 2019/7/17 10:35
 */
public class BranchManager extends BaseApprovalHandler {


    public BranchManager(BaseApprovalHandler baseApprovalHandler) {
        this.baseApprovalHandler = baseApprovalHandler;
    }

    @Override
    public void handlerRequest(int money) {

        //最大审批额度
        int maxMoney=1000;

        if(money <=maxMoney){
            System.out.println("我是"+this.getClass().getSimpleName()+"，正在审批金额 money="+money);
        }else {
            System.out.println("我是"+this.getClass().getSimpleName()+"，金额超出我的审批范围 money="+money);

            //传递请求
            transferRequest(money);
        }

    }
}
