package com.xiaola.demo.Facade.consumer;


import com.xiaola.api.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xiaola on 16/9/19.
 */
@Service
public class UserFacade {

    @Resource
    private IUserService userService;

    public  String getUserName(){
        userService.addUser();
        return  "result";
    }
}
