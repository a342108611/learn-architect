package com.huhupa.mapper;

import com.huhupa.pojo.SkGoods;
import com.huhupa.pojo.SkGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkGoodsMapper {
    int countByExample(SkGoodsExample example);

    int deleteByExample(SkGoodsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SkGoods record);

    int insertSelective(SkGoods record);

    List<SkGoods> selectByExampleWithBLOBs(SkGoodsExample example);

    List<SkGoods> selectByExample(SkGoodsExample example);

    SkGoods selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SkGoods record, @Param("example") SkGoodsExample example);

    int updateByExampleWithBLOBs(@Param("record") SkGoods record, @Param("example") SkGoodsExample example);

    int updateByExample(@Param("record") SkGoods record, @Param("example") SkGoodsExample example);

    int updateByPrimaryKeySelective(SkGoods record);

    int updateByPrimaryKeyWithBLOBs(SkGoods record);

    int updateByPrimaryKey(SkGoods record);
}