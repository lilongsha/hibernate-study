package com.mzvzm.entity;

import org.hibernate.annotations.Target;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/5/3 15:23
 */
@Entity(name = "city")
public class City {

    @Id
    private Long id;
    private String name;

    @Embedded
    @Target(GPS.class)
    private Coordinates coordinates;


}
