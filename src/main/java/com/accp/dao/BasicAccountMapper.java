package com.accp.dao;

import com.accp.pojo.BasicAccount;

public interface BasicAccountMapper {
    int insert(BasicAccount record);

    int insertSelective(BasicAccount record);
}