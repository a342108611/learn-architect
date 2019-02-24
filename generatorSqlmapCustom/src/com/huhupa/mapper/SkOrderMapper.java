package com.huhupa.mapper;

import com.huhupa.pojo.SkOrder;
import com.huhupa.pojo.SkOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkOrderMapper {
    int countByExample(SkOrderExample example);

    int deleteByExample(SkOrderExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SkOrder record);

    int insertSelective(SkOrder record);

    List<SkOrder> selectByExample(SkOrderExample example);

    SkOrder selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SkOrder record, @Param("example") SkOrderExample example);

    int updateByExample(@Param("record") SkOrder record, @Param("example") SkOrderExample example);

    int updateByPrimaryKeySelective(SkOrder record);

    int updateByPrimaryKey(SkOrder record);
}