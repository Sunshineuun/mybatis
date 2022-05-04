package com.qiusm.mybatis.service;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.qiusm.mybatis.entity.oracle.CfmxEntity;
import org.apache.ibatis.session.ResultHandler;

/**
 * @author qiushengming
 */
public interface CfmxService {
    void listByStream(ResultHandler<Model<?>> resultHandler);
}
