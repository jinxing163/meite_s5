package com.example.m1_design_mode.n3_chain_model.demo1;

/**
 * @author JinXing
 * @date 2019/7/17 9:39
 */
public abstract class BaseHandler {

    /**持有后续的责任对象*/
    protected BaseHandler baseHandler;

    /**
     * 示意处理请求的方法，虽然这个示意方法并没有传入参数
     * 但是实际是可以传入参数的，根据实际情况进行选择
     */
    public abstract void handleRequest();

    /**
     * 获取后续的责任对象
     */
    public BaseHandler getBaseHandler() {
        return baseHandler;
    }

    /**
     * 设置后续的责任对象
     */
    public void setBaseHandler(BaseHandler baseHandler) {
        this.baseHandler = baseHandler;
    }
}
