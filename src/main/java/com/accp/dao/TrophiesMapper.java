package com.accp.dao;

import com.accp.pojo.Trophies;

public interface TrophiesMapper {
    int deleteByPrimaryKey(Integer tId);

    int insert(Trophies record);

    int insertSelective(Trophies record);

    Trophies selectByPrimaryKey(Integer tId);

    int updateByPrimaryKeySelective(Trophies record);

    int updateByPrimaryKey(Trophies record);
}