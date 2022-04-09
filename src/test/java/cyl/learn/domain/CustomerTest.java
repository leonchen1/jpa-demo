package cyl.learn.domain;

import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * 示例：保存一条客户信息到数据库中
 * @author chenyongliang
 * @date 2022/4/9 15:52
 */
public class CustomerTest {

    @Test
    public void testSave() {
        // 加载配置文件创建工厂
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("myJpa");
        // 通过实体管理类工厂获取实体管理器
        EntityManager manager = factory.createEntityManager();
        // 获得事务对象，开启事务
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        // CURD 操作
        Customer customer = new Customer();
        customer.setCustName("XXX公司");
        customer.setCustIndustry("IT");
        manager.persist(customer);
        // 提交或回滚事务
        transaction.commit();
        // 释放资源
        manager.close();
        factory.close();
    }
}
