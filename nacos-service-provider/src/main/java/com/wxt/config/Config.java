package com.wxt.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Auther: ThomasWu
 * @Date: 2019/9/23 12:35
 * @Email:1414924381@qq.com
 */
@Component
@RefreshScope
public class Config {

    @Value("${address}")
    private String address;

    @Value("${age}")
    private String age;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
