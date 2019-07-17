package com.example.m1_design_mode.n3_chain_model.demo2;

import com.example.m1_design_mode.n3_chain_model.demo2.factory.HandlerFactory;
import com.example.m1_design_mode.n3_chain_model.demo2.impl.BranchManager;
import com.example.m1_design_mode.n3_chain_model.demo2.impl.GeneralManager;
import com.example.m1_design_mode.n3_chain_model.demo2.impl.ProjectManager;

/**
 * @author JinXing
 * @date 2019/7/17 10:45
 */
public class TestMain {


    public static void main(String[] args) {

        //申请金额
        int money = 8000;

//        testV1(money);

        testV2(money);
    }


    private static void testV2(int money) {

        System.out.println("\n\n项目经理开始审批");
        HandlerFactory.getProjectManagerHandler().handlerRequest(money);

        System.out.println("\n\n部门经理开始审批");
        HandlerFactory.getBranchManagerHandler().handlerRequest(money);

        System.out.println("\n\n总经理开始审批");
        HandlerFactory.getGeneralManagerHandler().handlerRequest(money);
    }

    private static void testV1(int money) {

        BaseApprovalHandler projectManager = new ProjectManager(null);
        BaseApprovalHandler branchManager = new BranchManager(null);
        BaseApprovalHandler generalManager = new GeneralManager(null);

        //项目经理的上级为部门经理
        projectManager.setBaseApprovalHandler(branchManager);

        //部门经理的上级为总经理
        branchManager.setBaseApprovalHandler(generalManager);

        //处理请求
        projectManager.handlerRequest(money);
    }

}
