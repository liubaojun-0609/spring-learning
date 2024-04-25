package com.liubj.factory;

import com.liubj.dao.UserDao;
import com.liubj.dao.imp.UserDaoImpl;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;

public class MyBeanFactory3 implements FactoryBean<UserDao> {

    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }
}
