package com.zkzong.dubbo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zong on 2017/3/31.
 */
@RestController
@RequestMapping(value = "/consumer")
public class ConsumerController {

    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        return "consumer";
    }
}
