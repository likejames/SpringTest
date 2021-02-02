package com.cn.test.service;

import org.springframework.stereotype.Component;

/**
 * @author : lj
 * @since : 2021/1/25
 */
@Component
public class PersonImpl implements PersonService{
    public void see() {
        System.out.println("我在看东西");
    }

    public void talk() {
        System.out.println("我在走路");
    }
}
