package com.accp.dao;

import com.accp.pojo.SysRoleFunction;

public interface SysRoleFunctionMapper {
    int deleteByPrimaryKey(Integer rfId);

    int insert(SysRoleFunction record);

    int insertSelective(SysRoleFunction record);

    SysRoleFunction selectByPrimaryKey(Integer rfId);

    int updateByPrimaryKeySelective(SysRoleFunction record);

    int updateByPrimaryKey(SysRoleFunction record);
}