package com.qiusm.mybatis.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qiusm.mybatis.dao.UserDao;
import com.qiusm.mybatis.entity.UserEntity;
import com.qiusm.mybatis.service.UserService;
import org.springframework.stereotype.Service;


/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author qiushengming
 * @since 2022-04-17
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, UserEntity> implements UserService {

}
