> Mybatis的实现

1. Mybatis save findById 实现
2. Mybatis 代码构建
3. MySQL URL 相关配置
    > useSLL=false; // 是否启用安全链接
    > useUnicode=true; //
    > characterEncoding=utf-8 // 字符集
    > serverTimezone=GT%2B8 // 
    > allowMultiQueries=true 
# Mybatis 配置
## 配置日志
```yml
mybatis-plus:
  configuration:
    log-impl: org.apache.ibatis.logging.stdout.StdOutImpl
```
## CRUD 扩展
### 主键生成策略
1. UUID
2. 自增ID
3. 雪花算法 [1](https://github.com/twitter-archive/snowflake)

```java
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
// 自增
@TableId(type = IdType.AUTO)
// 未设置主键
@TableId(type = IdType.NONE)
// 手动输入
@TableId(type = IdType.INPUT)
// 默认的全局唯一ID
@TableId(type = IdType.ID_WORKER)
```

## 其它
### 配置信息加密
基于jasypt实现。
```xml
<dependency>
    <groupId>com.github.ulisesbocchio</groupId>
    <artifactId>jasypt-spring-boot-starter</artifactId>
    <version>2.1.2</version>
</dependency>
```
```shell
java -cp jasypt-1.9.3.jar org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI input=root password=luyun algorithm=PBEWithMD5AndDES
----ENVIRONMENT-----------------
Runtime: Oracle Corporation Java HotSpot(TM) 64-Bit Server VM 11.0.12+8-LTS-237
----ARGUMENTS-------------------
input: root
password: luyun
algorithm: PBEWithMD5AndDES
----OUTPUT----------------------
xoJqlM1sWc5Xr8kDh8k/dA==
```
# 参考
1. Mybatis plus [1](https://baomidou.com/)