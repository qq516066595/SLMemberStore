package com.accp.dao;

import com.accp.pojo.Remittance;

public interface RemittanceMapper {
    int insert(Remittance record);

    int insertSelective(Remittance record);
}