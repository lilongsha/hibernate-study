package com.mzvzm.entity;

import org.hibernate.annotations.ColumnTransformer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/5/3 14:05
 */
@Entity(name = "employee")
public class Employee {
    @Id
    private String id;

    @Column(name = "pswd")
    @ColumnTransformer(
            read = "decrypt('AES', '00', pswd )",
            write = "encrypt('AES', '00', ?)"
    )
    private String password;
}
