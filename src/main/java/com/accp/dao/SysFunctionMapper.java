package com.accp.dao;

import com.accp.pojo.SysFunction;

public interface SysFunctionMapper {
    int deleteByPrimaryKey(Integer fId);

    int insert(SysFunction record);

    int insertSelective(SysFunction record);

    SysFunction selectByPrimaryKey(Integer fId);

    int updateByPrimaryKeySelective(SysFunction record);

    int updateByPrimaryKey(SysFunction record);
}