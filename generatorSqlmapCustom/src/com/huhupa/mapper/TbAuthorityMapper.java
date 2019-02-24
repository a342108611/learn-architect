package com.huhupa.mapper;

import com.huhupa.pojo.TbAuthority;
import com.huhupa.pojo.TbAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAuthorityMapper {
    int countByExample(TbAuthorityExample example);

    int deleteByExample(TbAuthorityExample example);

    int deleteByPrimaryKey(Integer authorityId);

    int insert(TbAuthority record);

    int insertSelective(TbAuthority record);

    List<TbAuthority> selectByExample(TbAuthorityExample example);

    TbAuthority selectByPrimaryKey(Integer authorityId);

    int updateByExampleSelective(@Param("record") TbAuthority record, @Param("example") TbAuthorityExample example);

    int updateByExample(@Param("record") TbAuthority record, @Param("example") TbAuthorityExample example);

    int updateByPrimaryKeySelective(TbAuthority record);

    int updateByPrimaryKey(TbAuthority record);
}