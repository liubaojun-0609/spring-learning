package com.liubj.processor;

import com.liubj.utils.BaseClassScanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.RootBeanDefinition;

import java.util.Map;

public class MyComponentBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        //获取所有MyComponent注解的类
        Map<String, Class> myComponentClassMap = BaseClassScanUtils.scanMyComponentAnnotation("com.liubj");
        //遍历Map集合
        myComponentClassMap.forEach((beanName,clazz) ->{
            BeanDefinition beanDefinition = new RootBeanDefinition();
            String clazzName = clazz.getName();
            beanDefinition.setBeanClassName(clazzName);
            //注册到BeanDefinitionMap
            registry.registerBeanDefinition(beanName,beanDefinition);

        });
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

    }
}
