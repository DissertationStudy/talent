package com.gmd.service;

import com.gmd.pojo.Tbuser;

/*
 *功能描述
 *@autho helang
 *@data
 *@param  用户使用方法
 *@return
 */
public interface TbuserService {
    int deleteByPrimaryKey(Integer id);

    int insert(Tbuser record);

    int insertSelective(Tbuser record);

    Tbuser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Tbuser record);

    int updateByPrimaryKey(Tbuser record);

    Tbuser selectByIdOrUsernameAndPwd (Tbuser record);
}
