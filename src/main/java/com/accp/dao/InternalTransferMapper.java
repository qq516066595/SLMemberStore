package com.accp.dao;

import com.accp.pojo.InternalTransfer;

public interface InternalTransferMapper {
    int insert(InternalTransfer record);

    int insertSelective(InternalTransfer record);
}