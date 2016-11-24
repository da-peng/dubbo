package com.zkzong.dubbo.demo.provider;

import com.zkzong.dubbo.demo.DemoService;

/**
 * Created by Zong on 2016/11/24.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
