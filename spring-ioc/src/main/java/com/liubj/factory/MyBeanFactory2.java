package com.liubj.factory;

import com.liubj.dao.UserDao;
import com.liubj.dao.imp.UserDaoImpl;

public class MyBeanFactory2 {

    public UserDao userDao(){
        System.out.println("实例工厂创建bean对象！");
        return new UserDaoImpl();
    }
}
