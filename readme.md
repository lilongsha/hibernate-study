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
   1. length: org.hibernate.Length 常量
3. @Formula(value: String) 指定为虚拟列只读
4. @Convert(converter: Class, attributeName: String, disableConversion: Boolean)
5. @JdbcTypeCode(value: int) 指定数据库对应的类型
   1. value: java.sql.Types 常量
6. @Nationalized
7. @Lob
##### enums
1. @Enumerated(value: EnumType) 参见 com.mzvzm.entity.Phone
   1. EnumType.ORDINAL 根据序号位置对应
   2. EnumType.STRING 根据名称对应
2. 自定义char转enum 参见 com.mzvzm.entity.Gender\com.mzvzm.entity.Person\com.mzvzm.converter.GenderConverter
3. 使用自定义枚举映射@Type(type = "GenderType.class") 参见 org.hibernate.annotations.Type com.mzvzm.converter.GenderConverter
##### boolean
1. org.hibernate.type.YesNoConverter
2. org.hibernate.type.TrueFalseConverter
3. org.hibernate.type.NumericBooleanConverter
4. jakarta.persistence.AttributeConverter
5. 配置@Convert(converter = org.hibernate.type.YesNoConverter.class)
##### Clob/NClob
1. 使用Clob类型映射大数据字段，需要通过ClobProxy.generateProxy()设置，通过Clob.getCharacterStream()获取字节流
2. 映射到String
3. 映射到char[]
4. NClob与Clob相同
##### blob
1. 将数据库blob映射Blob，需要通过BlobProxy.generateProxy()设置，通过Blob.getBinaryStream()获取二进制字节流
2. 映射byte[]
##### numeric
1. 使用Duration映射numeric/Duration/INTERVAL_SECOND
##### timestamp_utc
1. 使用java.time.Instant映射
##### date
1. 使用java.time.LocalDate映射date类型
##### timestamp
1. 使用java.time.LocalDateTime映射timestamp类型
##### time
1. 使用java.time.LocalTime映射到time
##### TIMESTAMP/TIMESTAMP_WITH_TIMEZONE
1. 使用java.time.OffsetDateTime映射到TIMESTAMP/TIMESTAMP_WITH_TIMEZONE
##### TIME/TIME_WITH_TIMEZONE
1. 使用java.time.OffsetTime映射到TIME/TIME_WITH_TIMEZONE
##### VARCHAR
1. 使用java.util.TimeZone映射VARCHAR
##### TIMESTAMP/TIMESTAMP_WITH_TIMEZONE
1. 使用java.time.ZonedDateTime
##### VARCHAR
1. 使用java.util.Currency映射VARCHAR
2. 使用java.util.Locale映射VARCHAR
3. 使用java.util.UUID映射VARCHAR
##### INET/BINARY
1. 使用java.net.InetAddress映射
##### JSON
1. 使用Map<String, String> @JdbcTypeCode(SqlTypes.JSON)
