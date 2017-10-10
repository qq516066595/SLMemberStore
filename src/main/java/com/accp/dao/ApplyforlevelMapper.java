package com.accp.dao;

import com.accp.pojo.Applyforlevel;

public interface ApplyforlevelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Applyforlevel record);

    int insertSelective(Applyforlevel record);

    Applyforlevel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Applyforlevel record);

    int updateByPrimaryKey(Applyforlevel record);
}