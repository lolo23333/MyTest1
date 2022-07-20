package com.lolo.mybatis;


import com.lolo.Mybatis.Pojo.User;
import com.lolo.Mybatis.mapper.SQLMapper;
import com.lolo.Mybatis.utils.SqlSessionutils;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class SQLMapperTest {
@Test
    public void mohu() throws IOException {
    SqlSession sqlSession= SqlSessionutils.getSqlSesssion();
    SQLMapper sqlMapper= sqlSession.getMapper(SQLMapper.class);
    List<User>list=sqlMapper.testMohu("山");
    System.out.println(list);
}
@Test
    public void ids() throws IOException {
    SqlSession sqlSession=SqlSessionutils.getSqlSesssion();
    SQLMapper sqlMapper=sqlSession.getMapper(SQLMapper.class);
    int result= sqlMapper.deleteMore("1,2,3");
    System.out.println(result);

}
@Test
    public void testgetUserByTableName() throws IOException {
    SqlSession sqlSession=SqlSessionutils.getSqlSesssion();
    SQLMapper sqlMapper =sqlSession.getMapper(SQLMapper.class);
    List<User> list=sqlMapper.getUserByTableName("table_employee");
    System.out.println(list);
}
@Test
    public void insertUser() throws IOException {
    SqlSession sqlSession=SqlSessionutils.getSqlSesssion();
    SQLMapper sqlMapper=sqlSession.getMapper(SQLMapper.class);
    User user=new User(null,"山本五十六","123",1);
    sqlMapper.insertUser(user);
    System.out.println(user);
}

}
