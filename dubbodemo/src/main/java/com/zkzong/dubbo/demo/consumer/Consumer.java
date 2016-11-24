package com.zkzong.dubbo.demo.consumer;

import com.zkzong.dubbo.demo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Zong on 2016/11/24.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService");
        String hello = demoService.sayHello("world");

        System.out.println(hello);
    }
}
