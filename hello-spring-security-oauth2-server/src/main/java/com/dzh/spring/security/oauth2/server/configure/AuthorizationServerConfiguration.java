//package com.dzh.spring.security.oauth2.server.configure;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
//import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
//
///**
// * @Description TODO
// * @ClassName AuthorizationServerConfiguration
// * @Author DingZuoHeng
// * @Date 2020/3/9
// * @Version 1.0
// **/
//@Configuration
////开启认证服务
//@EnableAuthorizationServer
//public class AuthorizationServerConfiguration extends AuthorizationServerConfigurerAdapter {
//
//    @Autowired
//    private BCryptPasswordEncoder passwordEncoder;
//    @Override
//    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
//        clients.inMemory()
//                .withClient("clientId")
//                //secret 绝对不能明文，要加密
//                .secret(passwordEncoder.encode("clientSecret"))
//                .authorizedGrantTypes("authorization_code")
//                .scopes("app")
//                .redirectUris("https://www.baidu.com");
//    }
//}
