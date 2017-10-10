package com.accp.dao;

import com.accp.pojo.Notice;

public interface NoticeMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(Notice record);

    int insertSelective(Notice record);

    Notice selectByPrimaryKey(Integer nId);

    int updateByPrimaryKeySelective(Notice record);

    int updateByPrimaryKey(Notice record);
}