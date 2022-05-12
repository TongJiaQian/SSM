# AOP
## 简单案例
* 定义aop切面类
```
@Component //注入
@Aspect //切面类
public class myAdvice {
    @Pointcut("execution(void com.tongjiaqian.service.impl.aopServiceImpl.delete())") //切点，在执行括号中的方法时
    public void pointCut(){}

    @Before("pointCut()")//在切点之前
    public void bf(){
        System.out.println("I am pointCut...");
    }
}
```
* 配置类注解
```
@Configuration
@ComponentScan("com.tongjiaqian")
@EnableAspectJAutoProxy
public class AppConfig {
}
```
***
## 工作流程
* spring容器启动
* 读取所有切面配置中的切点
* 初始化bean，判定bean对应的类中的方法是否匹配到任意切入点  
  - 匹配失败，创建对象
  - 匹配成功，创建目标对象的代理对象  
* 获取bean执行方法
  - 获取bean，调用方法并执行
***
## 切入点表达式
* 通配符使用
  - *单个独立符号，作为前缀后缀  
  `execution(void com.tongjiaqian.service.*.aopServiceImpl.findBy*(*))`
  - ..多个连续的任意符号，简化包名和参数  
  `execution(void com.tongjiaqian..aopServiceImpl.delete())`
* 书写技巧
  - 切入点描述接口
  - 省略访问修饰符
  - 包名用*通配符
  - 接口名类名用*通配符，如userService,*Service
  - 方法名用 * 通配符，如getById,getBy*
***
## AOP通知类型
* 前置
@Before
* 后置
@After
* 环绕
@Around  
形参提供ProceedingJoinPoint pjp  
抛出Throwable对象
若目标对象有返回类型，设定为Object类型，并返回
```
@Around("pointCut()")
public Object AD(ProceedingJoinPoint pjp) throws Throwable {
    System.out.println("Before...");
    Object ret = pjp.proceed();
    System.out.println("After...");
    return ret;
}
```
* 返回后
@AfterReturning
* 抛出异常后
@AfterThrowing

