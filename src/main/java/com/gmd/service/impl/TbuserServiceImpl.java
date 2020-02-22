package com.gmd.service.impl;

import com.gmd.mapper.TbuserMapper;
import com.gmd.pojo.Tbuser;
import com.gmd.service.TbuserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("tbuserService")
public class TbuserServiceImpl implements TbuserService {
    @Autowired
    private TbuserMapper tbuserMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return this.tbuserMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Tbuser record) {
        return this.insert(record);
    }

    @Override
    public int insertSelective(Tbuser record) {
        return this.insertSelective(record);
    }

    @Override
    public Tbuser selectByPrimaryKey(Integer id) {
        return this.tbuserMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Tbuser record) {
        return this.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Tbuser record) {
        return this.updateByPrimaryKey(record);
    }
}
