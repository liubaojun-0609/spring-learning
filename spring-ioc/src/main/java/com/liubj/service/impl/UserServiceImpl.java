package com.liubj.service.impl;

import com.liubj.dao.UserDao;
import com.liubj.service.UserService;
import org.springframework.beans.factory.InitializingBean;

public class UserServiceImpl implements UserService, InitializingBean {
    private UserDao userDao;

    public void setUserDao(UserDao userDao){
        System.out.println("BeanFactory 注入UserDao:" + userDao);
        this.userDao = userDao;
    }

    public void init(){
        System.out.println("执行init 初始化");
    }

    public void destroy(){
        System.out.println("执行destroy 销毁");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行afterPropertiesSet ");
    }
}
