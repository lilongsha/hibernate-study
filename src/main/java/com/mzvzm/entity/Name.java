package com.mzvzm.entity;

import javax.persistence.Embeddable;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/4/28 16:02
 */
@Embeddable
public class Name {
    private String firstName;
    private String middleName;
    private String lastName;

    private Name() {
        throw new UnsupportedOperationException();
    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
