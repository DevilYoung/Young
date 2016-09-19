package com.xiaola.service;


import com.xiaola.api.IUserService;
import org.springframework.stereotype.Service;

/**
 * Created by xiaola on 16/9/19.
 */
@Service(value = "userService")
public class UserServiceImpl implements IUserService{

    public String getUserName() {
        return "yes";
    }
}