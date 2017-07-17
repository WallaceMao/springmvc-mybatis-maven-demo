# springmvc-mybatis-maven-demo
springMVC + maven + MyBatis demo for beginners

# usage
steps

## 1 configure maven
import spring MVC framework: `spring-webmvc`

## 2 新建web.xml及相关结构
1. idea配置web facet或手动创建
2. 配置servlet和servlet-mapping
3. 配置spring-servlet.xml

## 3 配置spring-servlet.xml
1. 配置context:component-scan
2. 如果使用注解，配置mvc:annotation-driven

## 4 写controller
1. 在类上添加@Controller注解和@RequestMapping("/xxx")注解
2. 在方法上添加@RequestMapping("/yyy")注解


# 参考链接
[http://blog.csdn.net/zhshulin/article/details/37956105](http://blog.csdn.net/zhshulin/article/details/37956105)
[http://www.cnblogs.com/sunniest/p/4555801.html](http://www.cnblogs.com/sunniest/p/4555801.html)
[http://www.mkyong.com/spring-mvc/gradle-spring-mvc-web-project-example/](http://www.mkyong.com/spring-mvc/gradle-spring-mvc-web-project-example/)

