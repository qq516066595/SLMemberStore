package com.accp.dao;

import com.accp.pojo.DataDictionary;

public interface DataDictionaryMapper {
    int insert(DataDictionary record);

    int insertSelective(DataDictionary record);
}