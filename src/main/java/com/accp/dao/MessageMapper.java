package com.accp.dao;

import com.accp.pojo.Message;

public interface MessageMapper {
    int deleteByPrimaryKey(Integer mId);

    int insert(Message record);

    int insertSelective(Message record);

    Message selectByPrimaryKey(Integer mId);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);
}