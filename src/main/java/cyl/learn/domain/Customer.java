package cyl.learn.domain;

import javax.persistence.*;

/**
 * 使用 @Entity 声明实体类
 *
 * 使用 @Table 声明实体类与数据库表的映射关系
 *      -name：数据库表名
 * @author chenyongliang
 * @date 2022/4/9 15:28
 */
@Entity
@Table(name = "cst_customer")
public class Customer {

    /**
     * 使用 @Id 声明主键
     *
     * 使用 @GeneratedValue 声明主键生成策略
     *      -strategy
     *          GenerationType.IDENTITY 自增（MySQL 适用）
     *          GenerationType.SEQUENCE 序列（底层数据库需支持序列，Oracle 适用）
     *          GenerationType.TABLE JPA 提供某种机制，通过一张表帮助实现主键自增
     *          GenerationType.AUTO 由程序自动选择主键生成策略
     *
     * 使用 @Column 声明属性与表字段的映射关系
     *      -name：字段名
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cust_id")
    private Long custId;

    @Column(name = "cust_name")
    private String custName;

    @Column(name = "cust_source")
    private String custSource;

    @Column(name = "cust_industry")
    private String custIndustry;

    @Column(name = "cust_level")
    private String custLevel;

    @Column(name = "cust_adress")
    private String custAdress;

    @Column(name = "cust_phone")
    private String custPhone;

    public Long getCustId() {
        return custId;
    }

    public void setCustId(Long custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }

    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }

    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }

    public String getCustAdress() {
        return custAdress;
    }

    public void setCustAdress(String custAdress) {
        this.custAdress = custAdress;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custSource='" + custSource + '\'' +
                ", custIndustry='" + custIndustry + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", custAdress='" + custAdress + '\'' +
                ", custPhone='" + custPhone + '\'' +
                '}';
    }
}
