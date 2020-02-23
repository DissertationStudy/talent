package com.gmd.mapper;

import com.gmd.pojo.Tbuser;

public interface TbuserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Tbuser record);

    int insertSelective(Tbuser record);

    Tbuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tbuser record);

    int updateByPrimaryKey(Tbuser record);

    Tbuser selectByIdOrUsernameAndPwd (Tbuser record);
}