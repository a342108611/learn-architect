package com.huhupa.mapper;

import com.huhupa.pojo.TbExchangeItem;
import com.huhupa.pojo.TbExchangeItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbExchangeItemMapper {
    int countByExample(TbExchangeItemExample example);

    int deleteByExample(TbExchangeItemExample example);

    int deleteByPrimaryKey(Integer exchangeItemId);

    int insert(TbExchangeItem record);

    int insertSelective(TbExchangeItem record);

    List<TbExchangeItem> selectByExample(TbExchangeItemExample example);

    TbExchangeItem selectByPrimaryKey(Integer exchangeItemId);

    int updateByExampleSelective(@Param("record") TbExchangeItem record, @Param("example") TbExchangeItemExample example);

    int updateByExample(@Param("record") TbExchangeItem record, @Param("example") TbExchangeItemExample example);

    int updateByPrimaryKeySelective(TbExchangeItem record);

    int updateByPrimaryKey(TbExchangeItem record);
}