package com.accp.dao;

import com.accp.pojo.Downloadcore;

public interface DownloadcoreMapper {
    int deleteByPrimaryKey(Integer dId);

    int insert(Downloadcore record);

    int insertSelective(Downloadcore record);

    Downloadcore selectByPrimaryKey(Integer dId);

    int updateByPrimaryKeySelective(Downloadcore record);

    int updateByPrimaryKey(Downloadcore record);
}