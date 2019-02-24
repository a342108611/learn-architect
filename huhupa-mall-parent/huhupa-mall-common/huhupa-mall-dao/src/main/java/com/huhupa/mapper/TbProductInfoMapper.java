package com.huhupa.mapper;

import com.huhupa.pojo.TbProductInfo;
import com.huhupa.pojo.TbProductInfoExample;
import com.huhupa.pojo.TbProductInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductInfoMapper {
    int countByExample(TbProductInfoExample example);

    int deleteByExample(TbProductInfoExample example);

    int deleteByPrimaryKey(Integer productId);

    int insert(TbProductInfoWithBLOBs record);

    int insertSelective(TbProductInfoWithBLOBs record);

    List<TbProductInfoWithBLOBs> selectByExampleWithBLOBs(TbProductInfoExample example);

    List<TbProductInfo> selectByExample(TbProductInfoExample example);

    TbProductInfoWithBLOBs selectByPrimaryKey(Integer productId);

    int updateByExampleSelective(@Param("record") TbProductInfoWithBLOBs record, @Param("example") TbProductInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") TbProductInfoWithBLOBs record, @Param("example") TbProductInfoExample example);

    int updateByExample(@Param("record") TbProductInfo record, @Param("example") TbProductInfoExample example);

    int updateByPrimaryKeySelective(TbProductInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TbProductInfoWithBLOBs record);

    int updateByPrimaryKey(TbProductInfo record);
}