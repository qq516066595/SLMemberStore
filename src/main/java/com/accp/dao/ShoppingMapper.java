package com.accp.dao;

import com.accp.pojo.Shopping;

public interface ShoppingMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(Shopping record);

    int insertSelective(Shopping record);

    Shopping selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(Shopping record);

    int updateByPrimaryKey(Shopping record);
}