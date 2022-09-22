package com.qiusm.mybatis;

import com.alibaba.cloud.dubbo.actuate.DubboMetadataEndpointAutoConfiguration;
import com.alibaba.cloud.dubbo.autoconfigure.*;
import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.spring.boot.autoconfigure.DubboAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@EnableEncryptableProperties
@SpringBootApplication(exclude = {
        DubboAutoConfiguration.class,
        DubboMetadataAutoConfiguration.class,
        DubboServiceAutoConfiguration.class,
        DubboOpenFeignAutoConfiguration.class,
        DubboServiceDiscoveryAutoConfiguration.class,
        DubboMetadataEndpointAutoConfiguration.class,
        DubboLoadBalancedRestTemplateAutoConfiguration.class,
        DubboServiceRegistrationAutoConfiguration.class
})
public class MybatisApplication {

    public static void main(String[] args) {
        System.setProperty("nacos.logging.default.config.enabled","false");
        SpringApplication.run(MybatisApplication.class, args);
        log.info("Mybatis 启动成功！！！");
    }

}
