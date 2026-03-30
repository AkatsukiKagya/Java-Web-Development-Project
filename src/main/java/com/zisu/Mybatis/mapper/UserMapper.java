package com.zisu.Mybatis.mapper;

import com.zisu.Mybatis.pojo.Clazz;
import com.zisu.Mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public User getUserByUserid(Integer userid);

    public User getUserByName(String username);

    public User getUserByIdandName(String userid, String username);

    public User getUserBymap(Map<String, Object> map);

    public User getUserByParamAnnotation(@Param("userid") String userid, @Param("username") String username);

    public User getUserByUser(User user);

    public User updateUser(User user);

    public Integer batchInsertUsers(List<User> users);

    public Integer deleteUserById(Integer userid);

    public Clazz getClazzWithCoursesById(String clazzId);

    public List<Clazz> getAllClazzWithCourses();
}
