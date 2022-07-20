package com.lolo.Mybatis.mapper;

import com.lolo.Mybatis.Pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SQLMapper {
    List<User> testMohu(@Param("mohu")String mohu);
//    批量删除
    int deleteMore(@Param("ids")String ids);
    //动态设置表名
      List<User>getUserByTableName(@Param("tableName") String tableName);

void insertUser(User user);
}
