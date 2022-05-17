# Maven高级
## 分模块开发
* 新建模块，完成相应的功能
* 导入相应的依赖，若是自己写的，要用install下载到本地maven仓库才能用
* 例子：把pojo拆到了Maven02中
***
## 可选依赖(我不想别人用我的)
* 隐藏当前工程所依赖的资源：<optional>true</optional>
***
## 排除依赖(我不想用别人的)
* 引用其他模块时：
```
<exclusions>
    <exclusion>
        <groupId>xx</groupId>
        <artifactId>xx</artifactId>
    <exclusion>
<exclusions>
```
***
## 聚合
* 创建根模块
* 设置打包形式
* 设置聚合的子模块
```
<packaging>pom</packaging>

<modules>
    <module>...</module>
    <module>...</module>
</modules>
```
***
## 继承
* 创建根模块
* 设置打包形式
* 设置根模块的依赖
* 设置根模块的可选依赖(<dependencyManagement>)
* 在子模块中配置继承的模块(对于可选依赖不写版本号)(<parent>)
***
## 属性
* pom文件里，写了方便版本管理
```
<properties>
    <spring-version>5.3.20</spring-version>
</properties>
```
***
## 多环境开发
```
<profiles>
    <profile>
        <id>xx</id>
        <properties>
            <xxx>xxx</xxx>
        </properties>
    </profile>
</profiles>
```
***
## 跳过测试
* mvn指令
* 更具体的在pom中：
```
<build>
    <plugins>
        <plugin>
            <artifactId>xx</artifactId>
            <version>xx</version>
            <configuration>
                <skipTests>true</skipTests>
                <includes></includes>包括的测试
                <excludes></excludes>派出的测试
            </configuration>
        </plugin>
    </plugins>
</build>
```


