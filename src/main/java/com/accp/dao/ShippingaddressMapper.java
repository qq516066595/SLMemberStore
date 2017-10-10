package com.accp.dao;

import com.accp.pojo.Shippingaddress;

public interface ShippingaddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Shippingaddress record);

    int insertSelective(Shippingaddress record);

    Shippingaddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shippingaddress record);

    int updateByPrimaryKey(Shippingaddress record);
}