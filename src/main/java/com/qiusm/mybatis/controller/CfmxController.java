package com.qiusm.mybatis.controller;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.qiusm.mybatis.dao.CfmxMapper;
import com.qiusm.mybatis.entity.oracle.CfmxEntity;
import com.qiusm.mybatis.service.CfmxService;
import com.qiusm.spring.service.MongoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author qiushengming
 */
@Slf4j
@RestController
@RequestMapping("cfmx")
public class CfmxController {
    @DubboReference(version = "0.0.1")
    private MongoService mongoGhdjService;

    @Resource
    private CfmxService cfmxService;

    final private AtomicInteger count = new AtomicInteger();
    // final private Integer index = 6876026;

    @GetMapping("list/stream")
    public void cfmx(Integer index) {
        cfmxService.listByStream(resultContext -> {
            int c = count.incrementAndGet();
            if (c > index) {
                CfmxEntity obj = (CfmxEntity) resultContext.getResultObject();
                Boolean r = mongoGhdjService.insert(JSONObject.toJSONString(obj), "ck10_cfmx");
                log.info("Id: {}, result: {}", obj.getId(), r);
            }
        });

    }
}
