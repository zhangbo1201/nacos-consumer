package com.zhangbo.nacosconsumer;

import com.zhangbo.nacosconsumer.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NacosConsumerApplicationTests {
    @Autowired
    private UserService userService;

    @Test
    void contextLoads() {
        userService.queryById("1");
    }

}
