package com.huhupa.mapper;

import com.huhupa.pojo.TbShopUserRole;
import com.huhupa.pojo.TbShopUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbShopUserRoleMapper {
    int countByExample(TbShopUserRoleExample example);

    int deleteByExample(TbShopUserRoleExample example);

    int deleteByPrimaryKey(Integer shopUserRoleId);

    int insert(TbShopUserRole record);

    int insertSelective(TbShopUserRole record);

    List<TbShopUserRole> selectByExample(TbShopUserRoleExample example);

    TbShopUserRole selectByPrimaryKey(Integer shopUserRoleId);

    int updateByExampleSelective(@Param("record") TbShopUserRole record, @Param("example") TbShopUserRoleExample example);

    int updateByExample(@Param("record") TbShopUserRole record, @Param("example") TbShopUserRoleExample example);

    int updateByPrimaryKeySelective(TbShopUserRole record);

    int updateByPrimaryKey(TbShopUserRole record);
}