package com.accp.dao;

import com.accp.pojo.Area;

public interface AreaMapper {
    int insert(Area record);

    int insertSelective(Area record);
}