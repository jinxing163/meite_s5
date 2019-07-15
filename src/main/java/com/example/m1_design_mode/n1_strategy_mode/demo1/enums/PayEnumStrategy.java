package com.example.m1_design_mode.n1_strategy_mode.demo1.enums;

import com.example.m1_design_mode.n1_strategy_mode.demo1.impl.AliPayStrategy;
import com.example.m1_design_mode.n1_strategy_mode.demo1.impl.WeiXinPayStrategy;
import com.example.m1_design_mode.n1_strategy_mode.demo1.impl.XiaoMiPayStrategy;

/**
 * @author JinXing
 * @date 2019/6/3 17:35
 */
public enum PayEnumStrategy {


    /** 支付方式 */
    ALI_PAY("aliPay", AliPayStrategy.class),
    WX_PAY("wxPay", WeiXinPayStrategy.class),
    XM_PAY("xmPay", XiaoMiPayStrategy.class),;

    private String code;
    /** 枚举定义+描述 */
    private Class<?> classPath;

    PayEnumStrategy(String code, Class<?> classPath) {
        this.code = code;
        this.classPath = classPath;
    }

    public String getCode() {
        return code;
    }

    public Class<?> getClassPath() {
        return classPath;
    }


    /** 根据code获取对应的枚举对象 */
    public static PayEnumStrategy getEnum(String code) {
        PayEnumStrategy[] values = PayEnumStrategy.values();
        if (null != code && values.length > 0) {
            for (PayEnumStrategy value : values) {
                if (value.code.equals(code)) {
                    return value;
                }
            }
        }
        return null;
    }

}
