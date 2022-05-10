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
