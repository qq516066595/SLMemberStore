package com.accp.dao;

import com.accp.pojo.BasicInfo;

public interface BasicInfoMapper {
    int insert(BasicInfo record);

    int insertSelective(BasicInfo record);
}