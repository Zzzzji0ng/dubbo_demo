package com.dubbo;

import com.alibaba.fastjson2.JSON;
import com.dubbo.api.UserAPI;
import com.dubbo.dto.UserInfoDTO;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@Slf4j
// 开启Dubbo注解
public class UserConsumerApplication implements CommandLineRunner {

    @DubboReference
    private UserAPI userAPI;

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        while (true) {
            UserInfoDTO testUserName = userAPI.getUserInfo("TestUserName");
            log.info("userInfo : {}", JSON.toJSONString(testUserName));
            Thread.sleep(5000);
        }
    }
}
