package com.zhangbo.nacosconsumer.controller;

import com.zhangbo.nacosconsumer.Service.UserService;
import com.zhangbo.nacosconsumer.client.ProviderClient;
import com.zhangbo.nacosconsumer.jpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ProviderClient providerClient;
    @Autowired
    private UserService userService;

    @GetMapping("/hi-resttemplate")
    public String hiResttemplate(){
        return restTemplate.getForObject("http://nacos-provider/hi?name=resttemplate",String.class);

    }

    @GetMapping("/hi-feign")
    public String hiFeign(){
        return providerClient.hi("feign");
    }

    @GetMapping("getUser")
    public User getById(@RequestParam(value = "id" ,defaultValue = "1") String id){
        return userService.queryById(id);
    }
}