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
        4.1.1. Persistence 提供静态方法 createEntityManagerFactory 根据持久化单元名称创建实体管理器工厂
    4.2. 通过实体管理类工厂获取实体管理器
        4.2.1. EntityManagerFactory 维护了众多内容，对象创建浪费资源
            4.2.1.1. 维护了数据库信息
            4.2.1.2. 维护了缓存信息
            4.2.1.3. 维护了所有的实体类管理器对象
            4.2.1.4. 该类对象创建时会根据配置创建数据库表
            4.2.1.5. 线程安全
        4.2.2. 使用静态代码块的形式创建 EntityManagerFactory，维护一个共有的对象，以解决资源浪费、耗时问题
    4.3. 创建事务对象，开启事务
    4.4. CURD 操作
    4.5. 提交或回滚事务
    4.5. 释放资源