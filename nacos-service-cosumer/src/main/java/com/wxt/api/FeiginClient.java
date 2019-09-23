package com.wxt.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Description: TODO
 * @Auther: ThomasWu
 * @Date: 2019/9/21 21:30
 * @Email:1414924381@qq.com
 */
@FeignClient(name = "service-provider")
public interface FeiginClient {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
