package com.dzh.spring.security.oauth2.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Description TODO
 * @ClassName OAuth2ServerApplication
 * @Author DingZuoHeng
 * @Date 2020/3/9
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.dzh.spring.security.oauth2.server.mapper")
public class OAuth2ServerApplication {

    public static void main(String[] args){
        SpringApplication.run(OAuth2ServerApplication.class,args);
    }
}
