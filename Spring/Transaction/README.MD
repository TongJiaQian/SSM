# Spring事务
## 相关配置
* 配置文件中bean对象
```
事务管理器
@Bean
public PlatformTransactionManager transactionManager(DataSource dataSource){
    DataSourceTransactionManager transactionManager = new DataSourceTransactionManager();
    transactionManager.setDataSource(dataSource);
    return transactionManager;
}
@EnableTransactionManagement
```
* 在service接口层添加@Transactional开启事务(方法和接口都可以)
***
## 事务属性
![](https://s3.bmp.ovh/imgs/2022/05/12/dfccb1d69ea29ecb.jpg)
写在@Transactional里面
***
## 事务传播行为
@Transactional(propagation = Propagation.*)
![](https://i.bmp.ovh/imgs/2022/05/12/0715a39ebd83eab3.png)
***
## 代码中完成了事务传播行为的演示
