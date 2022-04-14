package com.it.Dao;

import com.it.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public User add(User user) {
        String sql = "insert into user value(?,?,?,?)";
        Object[] args = {user.getId(),user.getUname(),user.getPwd()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
       return user;
    }

    @Override
    public String update(String id) {
        return null;
    }
   /* @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public String update(String id) {
        return id;
    }*/
}
