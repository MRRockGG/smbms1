package com.kuang.service.user;

import com.kuang.dao.BaseDao;
import com.kuang.dao.user.UserDao;
import com.kuang.dao.user.UserDaoImp;
import com.kuang.pojo.User;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class UserServiceImp implements UserService{


    private UserDao userDao;
    public UserServiceImp(){
        userDao = new UserDaoImp();
    }
    @Override
    public User login(String userCode, String password) {
        Connection connection = null;
        User user = null;

        try {
            connection = BaseDao.getConnection();
            User loginUser = userDao.getLoginUser(connection,userCode);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao.closeResource(connection,null,null);
        }
        return user;

    }
    @Test
    public void test(){
        UserServiceImp userServiceImp = new UserServiceImp();
        User admin = userServiceImp.login("admin", "aaaaa");
        System.out.println(admin.getUserPassword());


    }
}
