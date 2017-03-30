package com.zkzong.dubbo.consumer;

import com.zkzong.dubbo.web.entity.User;
import com.zkzong.dubbo.web.facade.UserFacade;
import com.zkzong.dubbo.web.facade.impl.UserFacadeImpl;
import com.zkzong.dubbo.web.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by Zong on 2017/3/30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {UserFacadeImpl.class, UserServiceImpl.class})
public class ConsumerTest {
    @Autowired
    private UserFacade userFacade;

    @Test
    public void consumer() {
        User user = userFacade.queryUser();
        System.out.println(user);
    }
}
