package com.huhupa.mapper;

import com.huhupa.pojo.TbCategory;
import com.huhupa.pojo.TbCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCategoryMapper {
    int countByExample(TbCategoryExample example);

    int deleteByExample(TbCategoryExample example);

    int deleteByPrimaryKey(Integer categoryId);

    int insert(TbCategory record);

    int insertSelective(TbCategory record);

    List<TbCategory> selectByExample(TbCategoryExample example);

    TbCategory selectByPrimaryKey(Integer categoryId);

    int updateByExampleSelective(@Param("record") TbCategory record, @Param("example") TbCategoryExample example);

    int updateByExample(@Param("record") TbCategory record, @Param("example") TbCategoryExample example);

    int updateByPrimaryKeySelective(TbCategory record);

    int updateByPrimaryKey(TbCategory record);
}