package com.it.Service;

import com.it.Dao.UserDao;
import com.it.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
   private UserDao userdao;

    public UserDao getUserdao() {
        return userdao;
    }
    public User add(User user){
        return user;
    }

    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }
}
