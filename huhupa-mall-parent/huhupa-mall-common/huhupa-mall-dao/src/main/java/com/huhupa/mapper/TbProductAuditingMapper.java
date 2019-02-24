package com.huhupa.mapper;

import com.huhupa.pojo.TbProductAuditing;
import com.huhupa.pojo.TbProductAuditingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbProductAuditingMapper {
    int countByExample(TbProductAuditingExample example);

    int deleteByExample(TbProductAuditingExample example);

    int deleteByPrimaryKey(Integer productAuditingId);

    int insert(TbProductAuditing record);

    int insertSelective(TbProductAuditing record);

    List<TbProductAuditing> selectByExample(TbProductAuditingExample example);

    TbProductAuditing selectByPrimaryKey(Integer productAuditingId);

    int updateByExampleSelective(@Param("record") TbProductAuditing record, @Param("example") TbProductAuditingExample example);

    int updateByExample(@Param("record") TbProductAuditing record, @Param("example") TbProductAuditingExample example);

    int updateByPrimaryKeySelective(TbProductAuditing record);

    int updateByPrimaryKey(TbProductAuditing record);
}