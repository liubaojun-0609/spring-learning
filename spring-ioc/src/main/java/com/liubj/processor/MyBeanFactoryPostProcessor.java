package com.liubj.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * 自定义bean 工厂后处理器
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor.postProcessBeanFactory()");
        //添加一个自定义的BeanDefinition
       /* BeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClassName("com.liubj.dao.impl.PersonDaoImpl");
        DefaultListableBeanFactory factory = (DefaultListableBeanFactory) beanFactory;
        factory.registerBeanDefinition("personDaoImpl",beanDefinition);*/
    }
}
