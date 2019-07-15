
package com.example.m1_design_mode.model;
/**
 * 支付策略 model
 */
public class PayStrategy  {
    /***/
    private Long id;
    /***/
    private String name;



    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return this.id;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    @Override
    public String toString() {
        return "PayStrategy{" +
                "id=" + id +
                ",name=" + name +

                '}';
    }


}
