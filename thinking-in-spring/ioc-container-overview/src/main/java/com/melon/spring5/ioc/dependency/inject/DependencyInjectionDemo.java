package com.melon.spring5.ioc.dependency.inject;

import com.melon.spring5.ioc.domain.User;
import com.melon.spring5.ioc.repository.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: DependencyLookupDemo
 * @Description: 依赖注入
 * @Author: 陈超
 * @Date: 2020/7/11 14:45
 **/
public class DependencyInjectionDemo {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-injection-context.xml");
        UserRepository userRepository = beanFactory.getBean("userRepository", UserRepository.class);
        ObjectFactory<User> objectFactory = userRepository.getObjectFactory();
        System.out.println(objectFactory.getObject());
//        System.out.println(userRepository.getUsers());
//        System.out.println(userRepository.getBeanFactory());
//        System.out.println(beanFactory.equals(userRepository.getBeanFactory()));
//        System.out.println(beanFactory.getBean(BeanFactory.class));

    }

}
