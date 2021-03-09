package com.z.kmodule.mybatis.mapper;

import com.z.kmodule.mybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface UserMapper {

    int insert(User user);

    List<User> selectById(int id);

    List<String> selectNameById(int id);
}
