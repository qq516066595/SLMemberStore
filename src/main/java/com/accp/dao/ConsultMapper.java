package com.accp.dao;

import com.accp.pojo.Consult;

public interface ConsultMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Consult record);

    int insertSelective(Consult record);

    Consult selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Consult record);

    int updateByPrimaryKey(Consult record);
}