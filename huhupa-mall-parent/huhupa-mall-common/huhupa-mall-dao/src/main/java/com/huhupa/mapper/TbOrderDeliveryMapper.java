package com.huhupa.mapper;

import com.huhupa.pojo.TbOrderDelivery;
import com.huhupa.pojo.TbOrderDeliveryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbOrderDeliveryMapper {
    int countByExample(TbOrderDeliveryExample example);

    int deleteByExample(TbOrderDeliveryExample example);

    int deleteByPrimaryKey(String deliveryId);

    int insert(TbOrderDelivery record);

    int insertSelective(TbOrderDelivery record);

    List<TbOrderDelivery> selectByExample(TbOrderDeliveryExample example);

    TbOrderDelivery selectByPrimaryKey(String deliveryId);

    int updateByExampleSelective(@Param("record") TbOrderDelivery record, @Param("example") TbOrderDeliveryExample example);

    int updateByExample(@Param("record") TbOrderDelivery record, @Param("example") TbOrderDeliveryExample example);

    int updateByPrimaryKeySelective(TbOrderDelivery record);

    int updateByPrimaryKey(TbOrderDelivery record);
}