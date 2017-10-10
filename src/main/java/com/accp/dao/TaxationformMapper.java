package com.accp.dao;

import com.accp.pojo.Taxationform;

public interface TaxationformMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Taxationform record);

    int insertSelective(Taxationform record);

    Taxationform selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Taxationform record);

    int updateByPrimaryKey(Taxationform record);
}