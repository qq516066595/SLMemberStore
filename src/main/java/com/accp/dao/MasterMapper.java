package com.accp.dao;

import com.accp.pojo.Master;

public interface MasterMapper {
    int insert(Master record);

    int insertSelective(Master record);
}