package com.liubj.factory;

import com.liubj.dao.UserDao;
import com.liubj.dao.imp.UserDaoImpl;

public class MyBeanFactory1 {

    public static UserDao userDao(){
        System.out.println("静态工厂创建bean对象！");
        return new UserDaoImpl();
    }
}
