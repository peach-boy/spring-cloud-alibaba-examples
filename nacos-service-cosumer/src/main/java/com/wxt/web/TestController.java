package com.wxt.web;

import com.wxt.api.FeiginClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: TODO
 * @Auther: ThomasWu
 * @Date: 2019/9/21 21:57
 * @Email:1414924381@qq.com
 */
@RestController
public class TestController {

    @Autowired
    private FeiginClient feiginClient;

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return feiginClient.hello(string);
    }
}
