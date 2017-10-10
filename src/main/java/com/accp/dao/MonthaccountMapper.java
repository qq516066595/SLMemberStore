package com.accp.dao;

import com.accp.pojo.Monthaccount;

public interface MonthaccountMapper {
    int deleteByPrimaryKey(Integer mSequence);

    int insert(Monthaccount record);

    int insertSelective(Monthaccount record);

    Monthaccount selectByPrimaryKey(Integer mSequence);

    int updateByPrimaryKeySelective(Monthaccount record);

    int updateByPrimaryKey(Monthaccount record);
}