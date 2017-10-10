package com.accp.dao;

import com.accp.pojo.Orderformdetail;

public interface OrderformdetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Orderformdetail record);

    int insertSelective(Orderformdetail record);

    Orderformdetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Orderformdetail record);

    int updateByPrimaryKey(Orderformdetail record);
}