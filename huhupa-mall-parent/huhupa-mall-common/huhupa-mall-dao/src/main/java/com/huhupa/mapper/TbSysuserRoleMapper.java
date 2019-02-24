package com.huhupa.mapper;

import com.huhupa.pojo.TbSysuserRole;
import com.huhupa.pojo.TbSysuserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbSysuserRoleMapper {
    int countByExample(TbSysuserRoleExample example);

    int deleteByExample(TbSysuserRoleExample example);

    int deleteByPrimaryKey(Integer sysuserRoleId);

    int insert(TbSysuserRole record);

    int insertSelective(TbSysuserRole record);

    List<TbSysuserRole> selectByExample(TbSysuserRoleExample example);

    TbSysuserRole selectByPrimaryKey(Integer sysuserRoleId);

    int updateByExampleSelective(@Param("record") TbSysuserRole record, @Param("example") TbSysuserRoleExample example);

    int updateByExample(@Param("record") TbSysuserRole record, @Param("example") TbSysuserRoleExample example);

    int updateByPrimaryKeySelective(TbSysuserRole record);

    int updateByPrimaryKey(TbSysuserRole record);
}