package com.xiaola.demo.service;

import org.springframework.stereotype.Service;

/**
 * Created by xiaola on 16/9/6.
 */
@Service
public class UserService {


    public String getUser(String userName){
        return  userName + "  hello";
    }
}
