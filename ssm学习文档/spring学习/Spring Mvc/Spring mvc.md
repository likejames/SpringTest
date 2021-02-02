															**Spring mvc**

![image-20210122143558609](/home/lj/.config/Typora/typora-user-images/image-20210122143558609.png)



![image-20210122143711852](/home/lj/.config/Typora/typora-user-images/image-20210122143711852.png)



![image-20210122143843840](/home/lj/.config/Typora/typora-user-images/image-20210122143843840.png)



<img src="/home/lj/.config/Typora/typora-user-images/image-20210122144053351.png" alt="image-20210122144053351" style="zoom:200%;" />

![image-20210122144237886](/home/lj/.config/Typora/typora-user-images/image-20210122144237886.png)





![image-20210122144343311](/home/lj/.config/Typora/typora-user-images/image-20210122144343311.png)



项目搭建

![image-20210122144826952](/home/lj/.config/Typora/typora-user-images/image-20210122144826952.png)



配置前端控制器：

![image-20210122145658596](/home/lj/.config/Typora/typora-user-images/image-20210122145658596.png)



创建Spring mvc 配置文件

![image-20210122145807451](/home/lj/.config/Typora/typora-user-images/image-20210122145807451.png)



配置tomcat

![image-20210122150105131](/home/lj/.config/Typora/typora-user-images/image-20210122150105131.png)



![image-20210122150152181](/home/lj/.config/Typora/typora-user-images/image-20210122150152181.png)



![image-20210122150215891](/home/lj/.config/Typora/typora-user-images/image-20210122150215891.png)

ｍvc xml配置文件：

```
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:mvc="http://www.springframework.org/schema/mvc" xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc.xsd http://www.springframework.org/schema/aop http://www.springframework.org/schema/aop/spring-aop.xsd">
    <!--扫描控制包-->
    <context:component-scan base-package="com.cn.test"></context:component-scan>

</beans>
```

配置视图解析器:

```
<!--配置视图解析器-->
<bean id="internalResourceViewResolver" class="org.springframework.web.servlet.view.InternalResourceViewResolver">
<!--配置jsp文件地址-->
    <property name="prefix" value="/WEB-INF/pages/"></property>
    <!--配置文件后缀-->
     <property name="suffix" value=".jsp"></property>
</bean>
```

```
<!--开启springMvc框架注解支持-->
<mvc:annotation-driven/>
```

spring mvc 程序加载步骤



![image-20210125110421598](/home/lj/.config/Typora/typora-user-images/image-20210125110421598.png)



![image-20210125111016280](/home/lj/.config/Typora/typora-user-images/image-20210125111016280.png)





![image-20210125110957613](/home/lj/.config/Typora/typora-user-images/image-20210125110957613.png)



![image-20210125161008512](/home/lj/.config/Typora/typora-user-images/image-20210125161008512.png)



