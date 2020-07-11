package com.melon.spring5.ioc.repository;

import com.melon.spring5.ioc.domain.User;
import lombok.Data;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;

import java.util.Collection;

/**
 * @ClassName: UserRepository
 * @Description:
 * @Author: 陈超
 * @Date: 2020/7/11 16:22
 **/
@Data
public class UserRepository {

    public Collection<User> users;

    private BeanFactory beanFactory;

    private ObjectFactory<User> objectFactory;


}
