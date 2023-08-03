# MOBI项目介绍

基于React+SpringBoot+MQ+AIGC的智能数据分析平台，区别于传统的BI，用户只需要导入原始的数据集、并输入分析诉求，就能自动生成可视化图表及分析结论，实现数据分析的便利性。



# 项目内容

项目可支持同步分析（提交等待后出结果），异步分析（提交后在“我的图表中”中查看结果），队列分析（提交后在“我的图表中”中查看结果）三种模式，并且所有分析结果均可以在“我的图表”中查看。

后端项目地址：https://github.com/JuntingMo/mobi-backend

前端项目地址：https://github.com/JuntingMo/mobi-frotend

智能分析（同步）页面：
![Image text](https://github.com/JuntingMo/mobi-backend/blob/master/Figure/result1.png)

![Image text](https://github.com/JuntingMo/mobi-backend/blob/master/Figure/result2.png)

智能分析（异步）页面，支持异步分析：
![Image text](https://github.com/JuntingMo/mobi-backend/blob/master/Figure/result3.png)

智能分析（队列）页面：
![Image text](https://github.com/JuntingMo/mobi-backend/blob/master/Figure/result4.png)

我的图表页面：
![Image text](https://github.com/JuntingMo/mobi-backend/blob/master/Figure/result5.png)

## 项目架构图
![Image text](https://github.com/JuntingMo/mobi-backend/blob/master/Figure/architecture.png)

## 技术栈

### 前端

- React18
- Ant Design Pro 5.x脚手架

### 后端

- SpringBoot
- MySQL
- Redis+Redisson限流
- 鱼聪明AI SDK（AI能力），底层为GPT3.5
- Easy Excel表格数据处理
- RabbitMQ消息队列

项目还在完善中...

# 项目环境

1. jdk8
2. SpringBoot 2.7.2
3. Redisson 3.21.3
4. RabbitMQ 5.17.0


## 快速上手

> 所有需要修改的地方都标记了 `todo`，便于大家找到修改的位置~

### MySQL 数据库

1）修改 `application.yml` 的数据库配置为你自己的：

```yml
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/my_db
    username: root
    password: 123456
```

2）执行 `sql/create_table.sql` 中的数据库语句，自动创建库表

3）启动项目，访问 `http://localhost:8101/api/doc.html` 即可打开接口文档，不需要写前端就能在线调试接口了~

![](doc/swagger.png)

### Redis、RabbitMQ



