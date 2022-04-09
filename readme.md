JPA 使用样例
1. 创建 maven 工程，添加相关坐标；
2. 配置 JPA 核心配置文件;
    2.1. 文件位置：src/META-INF/
    2.2. 文件名称：persistence.xml
    2.3. 文件约束：右键 META-INF -> NEW -> Edit File Templates -> Other -> JPA -> Deployment descriptors -> persistence_2_0.xml
3. 创建实体类
    例：cyl.learn.domain.Customer
4. JPA 操作步骤：
    4.1. 加载配置文件创建工厂
    4.2. 通过实体管理类工厂获取实体管理器
    4.3. 获得事务对象，开启事务
    4.4. CURD 操作
    4.5. 提交或回滚事务
    4.5. 释放资源