​																		**Spring aop**



![image-20210121112240272](/home/lj/.config/Typora/typora-user-images/image-20210121112240272.png)

动态代理：

基于接口

![image-20210121134648745](/home/lj/.config/Typora/typora-user-images/image-20210121134648745.png)

![image-20210121135033795](/home/lj/.config/Typora/typora-user-images/image-20210121135033795.png)

![image-20210121135216646](/home/lj/.config/Typora/typora-user-images/image-20210121135216646.png)

基于子类cglib方法

![image-20210121135823382](/home/lj/.config/Typora/typora-user-images/image-20210121135823382.png)

 

![image-20210121135950785](/home/lj/.config/Typora/typora-user-images/image-20210121135950785.png)

匿名内部类访问外部变量时，要求变量是最终的即用finnal 修饰



![image-20210121143444168](/home/lj/.config/Typora/typora-user-images/image-20210121143444168.png)

![image-20210121145618658](/home/lj/.config/Typora/typora-user-images/image-20210121145618658.png)



![image-20210121145830990](/home/lj/.config/Typora/typora-user-images/image-20210121145830990.png)

![image-20210121145905146](/home/lj/.config/Typora/typora-user-images/image-20210121145905146.png)



切入点表达式写法：

![image-20210121150103175](/home/lj/.config/Typora/typora-user-images/image-20210121150103175.png)

![image-20210121150711072](/home/lj/.config/Typora/typora-user-images/image-20210121150711072.png)

![image-20210121150953204](/home/lj/.config/Typora/typora-user-images/image-20210121150953204.png)

切入点表达式：

![image-20210121151204027](/home/lj/.config/Typora/typora-user-images/image-20210121151204027.png)

配置环绕通知：问题：当配置了环绕通知时业务方法不会打印

解决办法：

![image-20210121151651256](/home/lj/.config/Typora/typora-user-images/image-20210121151651256.png)

![image-20210121151403536](/home/lj/.config/Typora/typora-user-images/image-20210121151403536.png)

![image-20210121151838364](/home/lj/.config/Typora/typora-user-images/image-20210121151838364.png)

![image-20210121151911302](/home/lj/.config/Typora/typora-user-images/image-20210121151911302.png)

![image-20210121152024628](/home/lj/.config/Typora/typora-user-images/image-20210121152024628.png)

注解配置aop

![image-20210121152139992](/home/lj/.config/Typora/typora-user-images/image-20210121152139992.png)

切入点表达式：

![image-20210121152214493](/home/lj/.config/Typora/typora-user-images/image-20210121152214493.png)

开启aop不开启就报错

![image-20210121152255721](/home/lj/.config/Typora/typora-user-images/image-20210121152255721.png)

方法加上切入表达式：

![image-20210121152324314](/home/lj/.config/Typora/typora-user-images/image-20210121152324314.png)

全使用代码替换切面配置

![image-20210121152645781](/home/lj/.config/Typora/typora-user-images/image-20210121152645781.png)