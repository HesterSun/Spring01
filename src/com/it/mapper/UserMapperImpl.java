package com.it.mapper;

import com.it.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper{
    private SqlSessionTemplate sqlsession;
    public void setSqlsession(SqlSessionTemplate sqlsession){
       this.sqlsession = sqlsession;
    }
    @Override
    public List<User> select() {
        UserMapper userMapper = sqlsession.getMapper(UserMapper.class);
        return userMapper.select();
    }
}
