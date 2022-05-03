package com.mzvzm.entity;

import org.hibernate.Length;

import javax.persistence.*;


/**
 * @Author lilongsha
 * @Description
 * @Date 2022/4/28 16:38
 */
@Entity(name = "Phone")
public class Phone {

    @Id
    private Long id;

    @Column(name = "phone_number", length = Length.LONG)
    private String number;

    @Enumerated(EnumType.ORDINAL)
    @Column(name = "phone_type")
    private PhoneType type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public PhoneType getType() {
        return type;
    }

    public void setType(PhoneType type) {
        this.type = type;
    }
}