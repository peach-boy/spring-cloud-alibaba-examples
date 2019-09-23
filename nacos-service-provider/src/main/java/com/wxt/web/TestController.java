package com.wxt.web;

import com.wxt.config.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Auther: ThomasWu
 * @Date: 2019/9/21 22:00
 * @Email:1414924381@qq.com
 */
@RestController
@RefreshScope
public class TestController {

    @Autowired
    private Config config;

    @RequestMapping(value = "/hello")
    public String hello(@RequestParam String name) {
        return "hello " + name + "-" + config.getAge() + "-" + config.getAddress();
    }
}
