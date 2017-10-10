package com.accp.dao;

import com.accp.pojo.SysMenu;

public interface SysMenuMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
}