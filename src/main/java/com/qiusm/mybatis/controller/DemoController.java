package com.qiusm.mybatis.controller;

import com.alibaba.fastjson.JSONObject;
import com.qiusm.mybatis.entity.UserEntity;
import com.qiusm.spring.service.MongoService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Date;

/**
 * @author qiushengming
 */
@Slf4j
@RestController
@RequestMapping("demo")
public class DemoController {

    @DubboReference(version = "0.0.1")
    private MongoService mongoService;

    @GetMapping("remoteMongo")
    public String remoteMongo() {
        UserEntity u = new UserEntity();
        u.setUsername("limengya");
        u.setPassword(Base64.getEncoder().encodeToString(u.getUsername().getBytes(StandardCharsets.UTF_8)));
        u.setCreateTime(new Date());
        u.setId(1L);
        mongoService.insert(JSONObject.toJSONString(u), "uesr");
        return "ok";
    }

    @GetMapping("hello")
    public String hello() {
        return "hello word. OK!!!";
    }
}
