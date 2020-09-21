package com.congzhou.service.impl;

import com.congzhou.dao.UserDao;
import com.congzhou.service.UserService;
import com.congzhou.util.Logger;
import org.springframework.beans.factory.annotation.Autowired;


public class UserServiceImpl implements UserService {
    private UserDao userDao;

    @Autowired
    private Logger logger;

//    Spring的DI有两种方式：基于构造函数或基于setter方法，配置文件中对应<constructor-arg>和<property>标签，两种方式可以混用

//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public void say(){
        System.out.println("hey yeah");
    }

    @Override
    public void getList(){
        logger.log("获取用户列表");
        userDao.getList();
    }
}
