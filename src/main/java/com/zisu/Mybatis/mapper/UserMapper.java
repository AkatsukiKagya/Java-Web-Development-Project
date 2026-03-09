package com.zisu.Mybatis.mapper;

import com.zisu.Mybatis.pojo.User;

import java.util.Map;

public interface UserMapper {
    public User getUserByUserid(Integer userid);
    public User getUserByName(String username);
    public User getUserByIdandName(String userid, String username);
    public User getUserBymap(Map<String, Object> map);
}
