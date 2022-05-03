package com.mzvzm.entity;

import com.mzvzm.converter.GenderConverter;
import com.mzvzm.type.GenderType;
import jakarta.persistence.Convert;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/4/28 17:01
 */
@Entity(name = "Person")
public class Person {

    @Id
    private Long id;

    private String name;

    @Convert(converter = GenderConverter.class)
    public Gender gender;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


}
