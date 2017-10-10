package com.accp.dao;

import com.accp.pojo.SysRoleMenu;

public interface SysRoleMenuMapper {
    int deleteByPrimaryKey(Integer rmId);

    int insert(SysRoleMenu record);

    int insertSelective(SysRoleMenu record);

    SysRoleMenu selectByPrimaryKey(Integer rmId);

    int updateByPrimaryKeySelective(SysRoleMenu record);

    int updateByPrimaryKey(SysRoleMenu record);
}