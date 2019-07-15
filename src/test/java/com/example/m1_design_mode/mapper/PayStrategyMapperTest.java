package com.example.m1_design_mode.mapper;

import com.example.m1_design_mode.BaseTest;
import com.example.m1_design_mode.model.PayStrategy;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author JinXing
 * @date 2019/6/4 16:57
 */
public class PayStrategyMapperTest extends BaseTest {

    @Resource
    private PayStrategyMapper payStrategyMapper;

    @Test
    public void save() {
        PayStrategy payStrategy = new PayStrategy();
        payStrategy.setName("222");
        payStrategyMapper.save(payStrategy);
        System.out.println(payStrategy.getId());
    }

    @Test
    public void listAll() {

        List<PayStrategy> payStrategies = payStrategyMapper.listAll();
        System.out.println(payStrategies);
    }
}