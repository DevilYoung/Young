package com.xiaola.service;


import com.xiaola.api.IUserService;
import com.xiaola.dao.UserInfoMapper;
import com.xiaola.entity.UserInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xiaola on 16/9/19.
 */
@Service(value = "userService")
public class UserServiceImpl implements IUserService{

    @Resource
    private UserInfoMapper userInfoMapper;

    public Integer addUser() {

        UserInfo userInfo = new UserInfo();
        userInfo.setAccount("mapper test");
        userInfo.setPassword("mapper test");
        userInfo.setUserName("mapper test");
        userInfo.setCreated(123445456565l);
        userInfo.setUpdated(123454565656l);

        return  userInfoMapper.insert(userInfo);
    }
}