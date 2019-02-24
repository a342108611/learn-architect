package com.huhupa.mapper;

import com.huhupa.pojo.SkUser;
import com.huhupa.pojo.SkUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkUserMapper {
    int countByExample(SkUserExample example);

    int deleteByExample(SkUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SkUser record);

    int insertSelective(SkUser record);

    List<SkUser> selectByExample(SkUserExample example);

    SkUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SkUser record, @Param("example") SkUserExample example);

    int updateByExample(@Param("record") SkUser record, @Param("example") SkUserExample example);

    int updateByPrimaryKeySelective(SkUser record);

    int updateByPrimaryKey(SkUser record);
}