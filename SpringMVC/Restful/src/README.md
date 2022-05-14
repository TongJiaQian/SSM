# REST风格
## 四种
* get查询
* post新增
* put修改
* delete删除
***
## 配置
* 因为springmvc配置的原因，拦截了所有网页，需要把相关前端的资源释放，具体编写springMvcSupportConfig类，并把他扫描进去
* 具体来说就是访问后面的请求方式变化，其他的数据交互都差不多，返回json数据直接返回对象即可

