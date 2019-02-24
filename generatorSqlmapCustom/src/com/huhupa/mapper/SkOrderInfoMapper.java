package com.huhupa.mapper;

import com.huhupa.pojo.SkOrderInfo;
import com.huhupa.pojo.SkOrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkOrderInfoMapper {
    int countByExample(SkOrderInfoExample example);

    int deleteByExample(SkOrderInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SkOrderInfo record);

    int insertSelective(SkOrderInfo record);

    List<SkOrderInfo> selectByExample(SkOrderInfoExample example);

    SkOrderInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SkOrderInfo record, @Param("example") SkOrderInfoExample example);

    int updateByExample(@Param("record") SkOrderInfo record, @Param("example") SkOrderInfoExample example);

    int updateByPrimaryKeySelective(SkOrderInfo record);

    int updateByPrimaryKey(SkOrderInfo record);
}