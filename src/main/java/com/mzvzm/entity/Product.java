package com.mzvzm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/4/28 16:10
 */
@Entity(name = "Product")
public class Product {

    @Id
    private Integer id;

    private String sku;

    private String name;

    private String description;
}
