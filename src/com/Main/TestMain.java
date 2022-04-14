package com.Main;

import com.it.Service.UserService;
import com.it.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {
    public static void main(String[] args) {
    }
    //@Test
    public void testJdbcTemplate(){
        ApplicationContext context  = new ClassPathXmlApplicationContext("beans2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User u = new User();
        u.setId(1);
        u.setUname("qq");
        u.setPwd("12345");
        userService.add(u);
    }
}
