package com.jianpeng.business.dao;

import com.jianpeng.business.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserDao {
    void addUser(User user);
}
