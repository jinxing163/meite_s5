package com.example.m1_design_mode.n3_chain_model.demo2;

/**
 * 审批处理抽象父类
 * @author JinXing
 * @date 2019/7/17 10:24
 */
public abstract class BaseApprovalHandler {


    /**
     * 审批当前请求的责任对象
     */
    protected BaseApprovalHandler baseApprovalHandler;

    /**
     * 处理当前请求的方法
     * 如果当前对象可以处理请求->处理请求
     * 如果当前对象不可以处理请求->传递给下家
     *
     * @param money 审批金额
     */
    public abstract void handlerRequest(int money);

    /**
     * 将请求传递给下家
     */
    protected void transferRequest(int money){

        //将请求传递给下家
        BaseApprovalHandler baseApprovalHandler = getBaseApprovalHandler();
        if (baseApprovalHandler != null) {
            baseApprovalHandler.handlerRequest(money);
        }
    }

    /**
     * 获取当前的责任对象
     */
    public BaseApprovalHandler getBaseApprovalHandler() {
        return baseApprovalHandler;
    }

    /**
     * 设置当前的责任对象
     */
    public void setBaseApprovalHandler(BaseApprovalHandler baseApprovalHandler) {
        this.baseApprovalHandler = baseApprovalHandler;
    }
}
