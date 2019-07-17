package com.example.m1_design_mode.n3_chain_model.demo2.factory;

import com.example.m1_design_mode.n3_chain_model.demo2.BaseApprovalHandler;
import com.example.m1_design_mode.n3_chain_model.demo2.impl.BranchManager;
import com.example.m1_design_mode.n3_chain_model.demo2.impl.GeneralManager;
import com.example.m1_design_mode.n3_chain_model.demo2.impl.ProjectManager;

/**
 * 处理功能
 * @author JinXing
 * @date 2019/7/17 10:55
 */
public class HandlerFactory {

    /**
     * 审批处理流程
     * 项目经理->部门经理->总经理
     */
    @Deprecated
    public static BaseApprovalHandler getProjectManagerHandler() {
        return new ProjectManager(new BranchManager(new GeneralManager(null)));
    }

    /**
     * 审批处理流程
     * 部门经理->总经理
     */
    public static BaseApprovalHandler getBranchManagerHandler() {
        return new BranchManager(new GeneralManager(null));
    }

    /**
     * 审批处理流程
     * 总经理
     */
    public static BaseApprovalHandler getGeneralManagerHandler() {
        return new GeneralManager(null);
    }

}
