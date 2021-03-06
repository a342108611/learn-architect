package com.huhupa.mapper;

import com.huhupa.pojo.TbSpecOption;
import com.huhupa.pojo.TbSpecOptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSpecOptionMapper {
    int countByExample(TbSpecOptionExample example);

    int deleteByExample(TbSpecOptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbSpecOption record);

    int insertSelective(TbSpecOption record);

    List<TbSpecOption> selectByExample(TbSpecOptionExample example);

    TbSpecOption selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbSpecOption record, @Param("example") TbSpecOptionExample example);

    int updateByExample(@Param("record") TbSpecOption record, @Param("example") TbSpecOptionExample example);

    int updateByPrimaryKeySelective(TbSpecOption record);

    int updateByPrimaryKey(TbSpecOption record);
}