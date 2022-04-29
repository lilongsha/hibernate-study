## Hibernate Study
### 概述
#### Hibernate实现了JPA(Java Persistence API)
![data_access_layer](./img/data_access_layers.svg)
##### EntityManagerFactory 会话工厂，线程安全
   1. javax.persistence.EntityManagerFactory
   2. org.hibernate.SessionFactory Hibernate在javax.persistence.EntityManagerFactory之上又添加了其它的接口规范
   3. org.hibernate.internal.SessionFactoryImpl Hibernate对SessionFactory规范的实现
   4. ![javax.persistence.EntityManagerFactory类以及Hibernate对其的实现](./img/EntityManagerFactory.png "javax.persistence.EntityManagerFactory")
##### EntityManager 会话，单线程，短期对象
   1. javax.persistence.EntityManager
   2. org.hibernate.Session
   3. org.hibernate.internal.SessionImpl
   4. ![javax.persistence.EntityManager数据库持久化上下文类以及实现](./img/EntityManager.png "javax.persistence.EntityManager")
##### EntityTransaction 事务，单线程，短期对象
   1. javax.persistence.EntityTransaction
   2. org.hibernate.Transaction
   3. org.hibernate.internal.TransactionImpl
   4. ![javax.persistence.EntityTransaction数据库持久化事务](./img/EntityTransaction.png "javax.persistence.EntityTransaction")
##### Type 数据库与Java类型的映射
   1. javax.persistence.Embeddable 注解 参见com.mzvzm.entity.Contact类
   2. org.hibernate.type.Type 接口，提供了定义映射类型的接口
   3. org.hibernate.type.AbstractType
   4. org.hibernate.type.BasicType 接口
   5. org.hibernate.type.AbstractSingleColumnStandardBasicType 单列标准类型基本接口
   6. ![org.hibernate.type.Type 数据库与Java类型的映射接口，可以实现自定义类型映射](./img/Type.png "org.hibernate.type.Type")
   7. 分类
      1. 值类型
      2. 实体类型
      3. 集合类型
##### annotation 注解
1. @Basic(optional: boolean, fetch: FetchType)
2. @Column(name: String, unique: boolean, nullable: boolean, insertable: boolean, updatable: boolean, columnDefinition: String, length: int, precision: int, scale: int)
3. @Formula(value: String) 指定为虚拟列只读
4. @Convert(converter: Class, attributeName: String, disableConversion: Boolean)
##### Enums
1. @Enumerated(value: EnumType) 参见 com.mzvzm.entity.Phone
   1. EnumType.ORDINAL 根据序号位置对应
   2. EnumType.STRING 根据名称对应
2. 自定义char转enum 参见 com.mzvzm.entity.Gender\com.mzvzm.entity.Person\com.mzvzm.converter.GenderConverter
3. 使用自定义枚举映射 参见 org.hibernate.annotations.Type
