package com.cn.test;

import com.cn.test.config.BeanConfig;
import com.cn.test.service.PersonImpl;
import com.cn.test.service.PersonService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : lj
 * @since : 2021/1/25
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        PersonService personService = applicationContext.getBean("personImpl", PersonImpl.class);
        personService.see();
    }
}
