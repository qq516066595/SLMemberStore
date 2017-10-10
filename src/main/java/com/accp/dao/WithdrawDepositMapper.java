package com.accp.dao;

import com.accp.pojo.WithdrawDeposit;

public interface WithdrawDepositMapper {
    int insert(WithdrawDeposit record);

    int insertSelective(WithdrawDeposit record);
}