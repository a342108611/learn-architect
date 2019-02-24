package com.huhupa.mapper;

import com.huhupa.pojo.TbAd;
import com.huhupa.pojo.TbAdExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAdMapper {
    int countByExample(TbAdExample example);

    int deleteByExample(TbAdExample example);

    int deleteByPrimaryKey(Integer adId);

    int insert(TbAd record);

    int insertSelective(TbAd record);

    List<TbAd> selectByExample(TbAdExample example);

    TbAd selectByPrimaryKey(Integer adId);

    int updateByExampleSelective(@Param("record") TbAd record, @Param("example") TbAdExample example);

    int updateByExample(@Param("record") TbAd record, @Param("example") TbAdExample example);

    int updateByPrimaryKeySelective(TbAd record);

    int updateByPrimaryKey(TbAd record);
}