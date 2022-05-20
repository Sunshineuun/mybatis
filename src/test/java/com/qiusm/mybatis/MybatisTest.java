package com.qiusm.mybatis;

import cn.hutool.crypto.digest.MD5;
import com.qiusm.mybatis.entity.UserEntity;
import com.qiusm.mybatis.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Date;

@Slf4j
public class MybatisTest extends MybatisApplicationTests {
    @Resource
    private UserService userService;

    @Test
    public void insert() {
        UserEntity user = new UserEntity();
        user.setUsername("qiusm-mybatis1");
        user.setPassword(MD5.create().digestHex(user.getUsername()));
        user.setCreateTime(new Date());
        userService.save(user);
        log.info("insert user : {}", user);
    }

    @Test
    public void select() {
        UserEntity user = userService.getById(2);
        log.info("select user : {}", user);
    }
}
