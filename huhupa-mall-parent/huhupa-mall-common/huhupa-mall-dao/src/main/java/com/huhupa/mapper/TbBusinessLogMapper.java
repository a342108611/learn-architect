package com.huhupa.mapper;

import com.huhupa.pojo.TbBusinessLog;
import com.huhupa.pojo.TbBusinessLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbBusinessLogMapper {
    int countByExample(TbBusinessLogExample example);

    int deleteByExample(TbBusinessLogExample example);

    int deleteByPrimaryKey(Integer businesslogId);

    int insert(TbBusinessLog record);

    int insertSelective(TbBusinessLog record);

    List<TbBusinessLog> selectByExample(TbBusinessLogExample example);

    TbBusinessLog selectByPrimaryKey(Integer businesslogId);

    int updateByExampleSelective(@Param("record") TbBusinessLog record, @Param("example") TbBusinessLogExample example);

    int updateByExample(@Param("record") TbBusinessLog record, @Param("example") TbBusinessLogExample example);

    int updateByPrimaryKeySelective(TbBusinessLog record);

    int updateByPrimaryKey(TbBusinessLog record);
}