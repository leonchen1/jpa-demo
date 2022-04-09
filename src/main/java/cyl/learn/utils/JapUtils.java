package cyl.learn.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author chenyongliang
 * @date 2022/4/9 20:32
 */
public class JapUtils {

    private static EntityManagerFactory factory;

    // JapUtils 加载到内存时，静态代码块会被执行
    static {
        // 加载配置文件
        factory = Persistence.createEntityManagerFactory("persistence.xml");
    }

    /**
     * 获取 EntityManager 对象
     * @return
     */
    public EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}
