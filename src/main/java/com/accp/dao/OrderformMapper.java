package com.accp.dao;

import com.accp.pojo.Orderform;

public interface OrderformMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orderform record);

    int insertSelective(Orderform record);

    Orderform selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orderform record);

    int updateByPrimaryKey(Orderform record);
}