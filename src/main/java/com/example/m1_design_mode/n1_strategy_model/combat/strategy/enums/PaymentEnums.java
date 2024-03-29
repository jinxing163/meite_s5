package com.example.m1_design_mode.n1_strategy_model.combat.strategy.enums;

import com.example.m1_design_mode.n1_strategy_model.combat.strategy.impl.AliPayStrategy;
import com.example.m1_design_mode.n1_strategy_model.combat.strategy.impl.CardPayStrategy;
import com.example.m1_design_mode.n1_strategy_model.combat.strategy.impl.WxPayStrategy;
import org.apache.commons.lang3.StringUtils;

/**
 * 支付方式枚举对象
 * code -> 支付方式别名
 * beanName -> 实例的名称
 *
 * @author JinXing
 * @date 2019/7/12 14:40
 */
public enum PaymentEnums {

    /** 支付方式 */
    ALI_PAY("ali_pay", AliPayStrategy.class.getSimpleName()),
    WX_PAY("WX_PAY", WxPayStrategy.class.getSimpleName()),
    CARD_PAY("card_pay", CardPayStrategy.class.getSimpleName()),

    ;

    /** 枚举定义+描述 */
    private String code;
    private String beanName;

    PaymentEnums(String code, String beanName) {
        this.code = code;
        this.beanName = StringUtils.isNotEmpty(beanName)?beanName.toLowerCase():null;
    }


    /** 根据code获取对应的枚举对象 */
    public static PaymentEnums getEnum(String code) {
        PaymentEnums[] values = PaymentEnums.values();
        if (null != code && values.length > 0) {
            for (PaymentEnums value : values) {
                if (value.code.equals(code)) {
                    return value;
                }
            }
        }
        return null;
    }

    /** 该code在枚举列表code属性是否存在 */
    public static boolean containsCode(String code) {
        PaymentEnums anEnum = getEnum(code);
        return anEnum != null;
    }

    /** 判断code与枚举中的code是否相同 */
    public static boolean equals(String code, PaymentEnums calendarSourceEnum) {
        return calendarSourceEnum.code.equals(code);
    }


    public String getCode() {
        return code;
    }

    public String getBeanName() {
        return beanName;
    }
}
