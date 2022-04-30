package com.qiusm.mybatis.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.BlockAttackInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * <code>@MapperScan</code>,用于配置需要扫描DAO的包名，可以用*当作通配符。一个*，表示一级包；两个*，表示多级包<br>
 * DAO的扫描可以对DAO用<code>@Mapper</code>进行标注。<br>
 *
 * @author qiushengming
 */
@MapperScan("com.qiusm.mybatis.**.dao")
@Configuration
@EnableTransactionManagement
public class MyBatisConfig {
    /**
     * 事务乐观锁插件
     *
     * @return MybatisPlusInterceptor
     */
    // @Bean
    public MybatisPlusInterceptor mybatisPlusTransactionInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new OptimisticLockerInnerInterceptor());
        return interceptor;
    }

    /**
     * 分页插件
     *
     * @return MybatisPlusInterceptor
     */
    // @Bean
    public MybatisPlusInterceptor mybatisPlusPageInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        PaginationInnerInterceptor paginationInnerInterceptor = new PaginationInnerInterceptor(DbType.MYSQL);
        interceptor.addInnerInterceptor(paginationInnerInterceptor);
        return interceptor;
    }

    /**
     * 逻辑删除插件
     *
     * @return MybatisPlusInterceptor
     */
    // @Bean
    public MybatisPlusInterceptor mybatisPlusDeleteInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new BlockAttackInnerInterceptor());
        return interceptor;
    }
}
