package com.accp.dao;

import com.accp.pojo.Users;

public interface UsersMapper {
    int insert(Users record);

    int insertSelective(Users record);
}