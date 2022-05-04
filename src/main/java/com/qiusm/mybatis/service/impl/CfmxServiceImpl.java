package com.qiusm.mybatis.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiusm.mybatis.dao.CfmxMapper;
import com.qiusm.mybatis.entity.oracle.CfmxEntity;
import com.qiusm.mybatis.service.CfmxService;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.stereotype.Service;

/**
 * @author qiushengming
 */
@DS("oracle")
@Service
public class CfmxServiceImpl extends ServiceImpl<CfmxMapper, CfmxEntity> implements CfmxService {

    @Override
    public void listByStream(ResultHandler<Model<?>> resultHandler){
        baseMapper.listByStream(resultHandler);
    }
}
