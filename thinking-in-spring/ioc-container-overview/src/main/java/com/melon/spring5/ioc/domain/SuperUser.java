package com.melon.spring5.ioc.domain;

import com.melon.spring5.ioc.annotation.Super;
import lombok.Data;

/**
 * @ClassName: SuperUser
 * @Description:
 * @Author: 陈超
 * @Date: 2020/7/11 16:04
 **/
@Super
@Data
public class SuperUser extends User{

    private String address;

    @Override
    public String toString() {
        return "SuperUser{" +
                "address='" + address + '\'' +
                "} " + super.toString();
    }
}
