package com.xiaola.dao;

import com.xiaola.entity.UserInfo;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

/**
 * Created by xiaola on 16/9/21.
 */
@Repository
public interface UserInfoMapper  extends Mapper<UserInfo>{

//    int insert(UserInfo userInfo);
}
