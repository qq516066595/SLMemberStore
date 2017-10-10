package com.accp.dao;

import com.accp.pojo.AccountsOfConsumption;

public interface AccountsOfConsumptionMapper {
    int insert(AccountsOfConsumption record);

    int insertSelective(AccountsOfConsumption record);
}