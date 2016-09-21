package com.xiaola.dao;

import com.xiaola.entity.UserInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by xiaola on 16/9/21.
 */
@Repository
public interface UserInfoMapper {

    int insert(UserInfo userInfo);
}
