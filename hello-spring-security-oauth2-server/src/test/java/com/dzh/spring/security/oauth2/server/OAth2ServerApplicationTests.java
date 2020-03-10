package com.dzh.spring.security.oauth2.server;

import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @Description TODO
 * @ClassName OAth2ServerApplicationTests
 * @Author DingZuoHeng
 * @Date 2020/3/9
 * @Version 1.0
 **/
@SpringBootTest
public class OAth2ServerApplicationTests {

    @Test
    public void testPasswordEncoder(){
        System.out.println(new BCryptPasswordEncoder().encode("123456"));
    }
}
