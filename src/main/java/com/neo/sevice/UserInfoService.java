package com.neo.sevice;

import com.neo.entity.UserInfo;

import java.util.List;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
    public List<UserInfo> findUserById(Integer id);
    public List<UserInfo> getUserList();

}
