![image-20210125155422695](/home/lj/.config/Typora/typora-user-images/image-20210125155422695.png)Spring  基于注解的ioc以及ioc的案例



![image-20210120153103480](/home/lj/.config/Typora/typora-user-images/image-20210120153103480.png)



![image-20210120155812388](/home/lj/.config/Typora/typora-user-images/image-20210120155812388.png)



![image-20210120161444603](/home/lj/.config/Typora/typora-user-images/image-20210120161444603.png)

必须要开启注解！！！！

![image-20210120161148808](/home/lj/.config/Typora/typora-user-images/image-20210120161148808.png)



![image-20210120161722199](/home/lj/.config/Typora/typora-user-images/image-20210120161722199.png)

![image-20210120162538129](/home/lj/.config/Typora/typora-user-images/image-20210120162538129.png)



![image-20210120162715707](/home/lj/.config/Typora/typora-user-images/image-20210120162715707.png)



![image-20210120162824546](/home/lj/.config/Typora/typora-user-images/image-20210120162824546.png)



基本数据类型注入:

![image-20210120162926239](/home/lj/.config/Typora/typora-user-images/image-20210120162926239.png)



![image-20210120163058113](/home/lj/.config/Typora/typora-user-images/image-20210120163058113.png)



![image-20210120163155844](/home/lj/.config/Typora/typora-user-images/image-20210120163155844.png)



![image-20210120163257794](/home/lj/.config/Typora/typora-user-images/image-20210120163257794.png)



![image-20210120170318793](/home/lj/.config/Typora/typora-user-images/image-20210120170318793.png)

　![image-20210120170526973](/home/lj/.config/Typora/typora-user-images/image-20210120170526973.png)

![image-20210120170853369](/home/lj/.config/Typora/typora-user-images/image-20210120170853369.png)

![image-20210120171124235](/home/lj/.config/Typora/typora-user-images/image-20210120171124235.png)

![image-20210120171817183](/home/lj/.config/Typora/typora-user-images/image-20210120171817183.png)

今日：https://www.bilibili.com/video/BV1mE411X7yp?p=118  2021.1.20



xml 文件头

```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd http://www.springframework.org/schema/context https://www.springframework.org/schema/context/spring-context.xsd">

</beans>
```

＠propertySouce注解使用配合@value读取配置文件使用

![image-20210121110221307](/home/lj/.config/Typora/typora-user-images/image-20210121110221307.png)

![image-20210121110425821](/home/lj/.config/Typora/typora-user-images/image-20210121110425821.png)

```
@Qualifier(value = "ds2")  ds2　多个数据源时　去指定使用  
```

![image-20210121111012902](/home/lj/.config/Typora/typora-user-images/image-20210121111012902.png)

Spring 整合junit 

注解方式：

![image-20210121111905150](/home/lj/.config/Typora/typora-user-images/image-20210121111905150.png)

配置文件方式：

![image-20210121112116815](/home/lj/.config/Typora/typora-user-images/image-20210121112116815.png)



注解方式:
![image-20210125155249081](/home/lj/.config/Typora/typora-user-images/image-20210125155249081.png)

![image-20210125155432778](/home/lj/.config/Typora/typora-user-images/image-20210125155432778.png)

![image-20210125155542902](/home/lj/.config/Typora/typora-user-images/image-20210125155542902.png)