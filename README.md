# empezar-cloud-template

### 创建项目

1. byrja-core: 基础组件配置等相关
2. byrja-redis：Redis服务相关
3. byrja-mq: Mq服务相关
4. byrja-services: 业务代码

### byrja-core

#### byrja-dependencies

依赖pom，统一存放方便管理

#### byrja-cloud-starter

spring-cloud相关组件的依赖

spring-cloud-starter-alibaba-nacos-discovery

spring-cloud-starter-alibaba-nacos-config

spring-cloud-starter-bootstrap: 读取bootstrap.yml配置

### byrja-services

业务代码模块，这里主要为演示作用

### profile 设置

pom文件要添加以下，否则spring配置文件无法以@xxx@读取到pom文件里的数据:

```xml

<build>
    <resources>
        <resource>
            <directory>src/main/resources</directory>
            <filtering>true</filtering>
        </resource>
    </resources>
</build>
```

