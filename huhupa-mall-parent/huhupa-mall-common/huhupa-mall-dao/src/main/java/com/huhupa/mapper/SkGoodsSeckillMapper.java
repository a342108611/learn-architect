package com.huhupa.mapper;

import com.huhupa.pojo.SkGoodsSeckill;
import com.huhupa.pojo.SkGoodsSeckillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SkGoodsSeckillMapper {
    int countByExample(SkGoodsSeckillExample example);

    int deleteByExample(SkGoodsSeckillExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SkGoodsSeckill record);

    int insertSelective(SkGoodsSeckill record);

    List<SkGoodsSeckill> selectByExample(SkGoodsSeckillExample example);

    SkGoodsSeckill selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SkGoodsSeckill record, @Param("example") SkGoodsSeckillExample example);

    int updateByExample(@Param("record") SkGoodsSeckill record, @Param("example") SkGoodsSeckillExample example);

    int updateByPrimaryKeySelective(SkGoodsSeckill record);

    int updateByPrimaryKey(SkGoodsSeckill record);
}