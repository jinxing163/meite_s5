package com.example.m1_design_mode.n3_chain_model.demo1;

import com.example.m1_design_mode.n3_chain_model.demo1.impl.ConcreteHandler;

/**
 * @author JinXing
 * @date 2019/7/17 9:50
 */
public class TestMain {


    public static void main(String[] args) {

        BaseHandler baseHandler1=new ConcreteHandler("baseHandler1");
        BaseHandler baseHandler2=new ConcreteHandler("baseHandler2");
        BaseHandler baseHandler3=new ConcreteHandler("baseHandler3");
        BaseHandler baseHandler4=new ConcreteHandler("baseHandler4");
        baseHandler1.setSuccessor(baseHandler2);
        baseHandler2.setSuccessor(baseHandler3);
        baseHandler3.setSuccessor(baseHandler4);

        //提交请求
        baseHandler1.handleRequest();

    }

}
