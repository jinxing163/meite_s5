package com.example.m1_design_mode.n3_chain_model.demo1.impl;

import com.example.m1_design_mode.n3_chain_model.demo1.BaseHandler;

import java.util.Date;

/**
 * @author JinXing
 * @date 2019/7/17 9:45
 */
public class ConcreteHandler extends BaseHandler {


    /**处理器名称*/
    private String handlerName;
    public ConcreteHandler(String handlerName) {
        this.handlerName = handlerName;
    }
    public String getHandlerName() {
        return handlerName;
    }

    /**
     * 处理请求的方法
     * 如果当前对象有下家，就传递给下家
     * 如果当前对象没有下家，就自行处理
     */
    @Override
    public void handleRequest() {

        if(getBaseHandler() !=null){
            System.out.println("已经有对象处理此请求！"+this.handlerName);
            getBaseHandler().handleRequest();
        }else {
            System.out.println("正在处理请求......."+this.handlerName);
        }

        System.out.println(" ======= 请求处理结束 ======= "+new Date().toLocaleString());
    }
}
