# 入门案例
## 配置
* SpringMvcConfig(controller层)
* SpringConfig(dao,service层)
* WebContainerInit(注意这里有两种方式)
***
## 请求映射路径
* @RequestMapping 可以放在类上形成前缀
* 参数，直接注解下的方法形参即可，get，post方法都可以
* 乱码处理放在web容器中，有对应的过滤器类方法
***
## 传递参数
* 普通参数：@RequestParam,这样做更好，取一个参数名
* 实体类参数(嵌套)：只要get和post中的参数名和实体类中的属性名一样就可以
* 数组：一样的名字会自动识别放入数组
* 集合：形参处加@RequestPara,把集合当成一个参数
* JSON：1、MVC配置类@EnableMvc开启转换功能 2、形参处@RequestBody 3、导入依赖
* 日期数据：@DataTimeFormat(patter="yyyy-mm-dd")
***
## 响应
* @ResponseBody不加就是响应页面或者纯文本，加上可以直接返回对象或者集合，会自动转换为JSON数据
