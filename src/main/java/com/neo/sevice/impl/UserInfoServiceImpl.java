package com.neo.sevice.impl;

import com.neo.dao.UserInfoDao;
import com.neo.entity.UserInfo;
import com.neo.sevice.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    private final JdbcTemplate jt;

    @Autowired
    public UserInfoServiceImpl(JdbcTemplate jt){
        this.jt = jt;
    }

    /*
    String sql = "select name from sysuser where id = 3";
    String s = this.jdbcTemplate.queryForObject(sql, String.class);
    System.out.println(s);
     */
    @Override
    public List<UserInfo> getUserList() {
        String sql = "select * from user_info";
        List<UserInfo> result = jt.query(sql,new Object[]{},new BeanPropertyRowMapper<UserInfo>(UserInfo.class));
        return result;
    }
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }

    @Override
    public List<UserInfo> findUserById(Integer id) {
        return userInfoDao.findUserInfoByUid(id);
    }
}