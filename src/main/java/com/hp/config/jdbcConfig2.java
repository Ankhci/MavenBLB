package com.hp.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class jdbcConfig2 {
    @Bean
    @ConfigurationProperties(prefix = "jdbc")//自动注入
    public DataSource getDataSouce(){
        DruidDataSource dataSource = new DruidDataSource();
        return dataSource;
    }
}
