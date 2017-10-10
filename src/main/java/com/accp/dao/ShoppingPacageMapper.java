package com.accp.dao;

import com.accp.pojo.ShoppingPacage;

public interface ShoppingPacageMapper {
    int deleteByPrimaryKey(Integer pId);

    int insert(ShoppingPacage record);

    int insertSelective(ShoppingPacage record);

    ShoppingPacage selectByPrimaryKey(Integer pId);

    int updateByPrimaryKeySelective(ShoppingPacage record);

    int updateByPrimaryKey(ShoppingPacage record);
}