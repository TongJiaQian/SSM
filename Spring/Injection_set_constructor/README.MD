# 依赖注入的方式
## setter注入
* 简单类型(int String)
```
//简单类型注入
int number;
String string;
//简单类型setter方法
public void setNumber(int number) {
    this.number = number;
}
public void setString(String string) {
    this.string = string;
}
//配置
<bean id="bookDao" class="com.tongjiaqian.Dao.Impl.BookDaoImpl">
    <property name="number" value="10"/>
    <property name="string" value="我是注入"/>
</bean>
```
* 引用类型(实例化对象)
```
//引用类型注入
public BookDao bookDao ;
public UserDao userDao ;
//引用类型setter方法
public void setBookDao(BookDao bookDao) {
    this.bookDao = bookDao;
}
public void setUserDao(UserDao userDao) {
    this.userDao = userDao;
}
//配置
<bean id="userservice" class="com.tongjiaqian.Service.Impl.UserServiceImpl">
    <property name="userDao" ref="userDao"/>
    <property name="bookDao" ref="bookDao"/>
</bean>
```
***
## 构造器注入
方法和setter注入一样，配置文件有不同，一般来说推荐使用setter注入
***
## 自动装配
不用setter和构造器，直接改配置  
```
<bean id="userservice" class="com.tongjiaqian.Service.Impl.UserServiceImpl" autowire="byType">
```
一般来说都是根据类型
***
## 集合注入
```
<property name="array/list/set">
    <array/list/set>
        <value>100</value>
        <value>100</value>
        <value>100</value>
    </array/list/set>
</property>

<property name="map">
    <map>
        <entry key="1" value="11"/>
        <entry key="1" value="11"/>
        <entry key="1" value="11"/>
    </map>
</property>

<property name="properties">
    <props>
        <prop key="1">100</prop>
        <prop key="1">100</prop>
        <prop key="1">100</prop>
    </props>
</property>
```
***
## 加载properties文件
* 命名空间(关于beans的改成context)  
```
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xsi:schemaLocation="
       http://www.springframework.org/schema/beans 
       http://www.springframework.org/schema/beans/spring-beans.xsd
       http://www.springframework.org/schema/context 
       http://www.springframework.org/schema/context/spring-context.xsd">
```
* 加载properties文件  
```
标准格式：<context:property-placeholder location="classpath:*.properties"/>
带jar包：<context:property-placeholder location="classpath*:*.properties"/>
占位符：${varname}
```