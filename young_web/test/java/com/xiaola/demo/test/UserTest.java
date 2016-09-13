package com.xiaola.demo.test;


import com.xiaola.demo.service.UserService;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by xiaola on 16/9/6.
 */
public class UserTest extends BaseTest {

    @Resource
    private UserService userService;

    @Test
    public void getUserTest(){
        String result =  userService.getUser("xiaola");
        System.out.print(result);
    }
}


