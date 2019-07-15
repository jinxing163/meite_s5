
package com.example.m1_design_mode.mapper;

import com.example.m1_design_mode.model.PayStrategy;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/**
 * 支付策略
 */
@Repository
public interface PayStrategyMapper {

    /**
    * 支付策略 新增
    */
     void save(PayStrategy payStrategy);


    /**
    * 支付策略 删除
    */
     void delete(PayStrategy payStrategy);


    /**
    * 支付策略 更新
    */
     void update(PayStrategy payStrategy);


    /**
    * 支付策略 查询单个
    */
     PayStrategy get(Long payStrategyId);


    /**
    * 支付策略 根据id查列表
    */
     List<PayStrategy> listOfIds(@Param("payStrategyIds") List<Long> payStrategyIds);


    /**
    * 支付策略 查询全部
    */
     List<PayStrategy> listAll();


}
