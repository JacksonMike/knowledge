package com.nci.knowledge.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenqian3
 * @date 2021/8/4 11:01
 * @description
 */
@Slf4j
@RestController
@RequestMapping(value = "/test")
public class TestController {

    @RequestMapping(value = "/say")
    public String sayHello() {
        log.info("测试接口");
        return "Hello world2222";
    }
}
