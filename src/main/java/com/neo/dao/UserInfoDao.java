package com.neo.dao;

import com.neo.entity.UserInfo;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface UserInfoDao extends CrudRepository<UserInfo,Long> {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
    public List<UserInfo> findUserInfoByUid(Integer username);
    public List<UserInfo> findAll();
}