package com.qiusm.mybatis.dao;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.qiusm.mybatis.entity.oracle.CfmxEntity;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.mapping.ResultSetType;
import org.apache.ibatis.session.ResultHandler;

/**
 * @author qiushengming
 */
public interface CfmxMapper extends BaseMapper<CfmxEntity> {
    /**
     * 流式查询
     *
     * @param resultHandler 返回结果处理器
     */
    @Select("select * from ck10_cfmx t")
    @Options(resultSetType = ResultSetType.FORWARD_ONLY, fetchSize = 1000)
    @ResultType(CfmxEntity.class)
    void listByStream(ResultHandler<Model<?>> resultHandler);
}
