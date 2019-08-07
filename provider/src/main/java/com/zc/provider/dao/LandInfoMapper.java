package com.zc.provider.dao;

import com.zc.provider.pojo.LandInfo;

public interface LandInfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(LandInfo record);

    int insertSelective(LandInfo record);

    LandInfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(LandInfo record);

    int updateByPrimaryKey(LandInfo record);
}