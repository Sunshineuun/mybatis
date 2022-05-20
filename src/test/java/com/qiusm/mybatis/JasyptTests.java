package com.qiusm.mybatis;

import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.EnvironmentPBEConfig;
import org.junit.jupiter.api.Test;

import javax.annotation.Resource;

/**
 * @author qiushengming
 */
@Slf4j
public class JasyptTests extends MybatisApplicationTests {

    public static void main(String[] args) {
        new JasyptTests().encrypt();
    }
    @Resource
    private StringEncryptor stringEncryptor;

    /**
     * 解码
     */
    @Test
    void encrypt() {
        StandardPBEStringEncryptor standardPBEStringEncryptor = new StandardPBEStringEncryptor();
        EnvironmentPBEConfig config = new EnvironmentPBEConfig();
        //config.setAlgorithm 设置加密方式
        config.setAlgorithm("PBEWithMD5AndDES");
        //config.setPassword 设置密钥
        config.setPassword("luyun");
        standardPBEStringEncryptor.setConfig(config);
        //设置明文密码
        String input = "root";
        //encrypt 是加密方法，decrypt是解密方法
        String encryptedText = standardPBEStringEncryptor.encrypt(input);
        log.info("encrypt: {}", encryptedText);
        log.info("decrypt: {}", standardPBEStringEncryptor.decrypt(encryptedText));
    }
}
