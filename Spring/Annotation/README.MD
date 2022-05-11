# 注解开发
## 纯注解开发
* 配置类
```
@Configuration //定义这是个配置类
@ComponentScan("com.tongjiaqian") //扫描包下的bean
public class AppConfig {
}
```
* 主方法
```
public class App 
{
    public static void main( String[] args )
    {
        //纯注解开发
        //新的实现类 AnnotationConfigApplicationContext
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        UserService userService = ctx.getBean("userService",UserService.class);
        System.out.println(userService);
    }
}
```
* bean对象注入
```
@Component //都可以用的注入注解，以下为细分
@Repository("userDao") //数据层
@Service("userService") //业务层
@Controller //表现层

@scope() //单例或多例
```
* bean生命周期
```
@PostConstruct //初始化
@PreDestroy //销毁
```
* 依赖注入
```
引用类型：@Autowired //若有多个相同类型的bean @Qualifier(名字)
简单类型：@Value
```
* 加载properties文件
```
@PropertiesSource({name.properties,name1.properties})
```
* 第三方bean
```
@Bean
在配置类中
@Import(第三方bean类.class)
依赖注入：
简单类型：成员变量
引用类型：方法形参
```

  