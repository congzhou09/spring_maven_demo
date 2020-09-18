package com.congzhou;

import com.congzhou.service.impl.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("app-bean.xml");

        UserServiceImpl oneUserService = (UserServiceImpl) appContext.getBean("userService");
        oneUserService.say(); // 打印 hey yeah
    }
}
