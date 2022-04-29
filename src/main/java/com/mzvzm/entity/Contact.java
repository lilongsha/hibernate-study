package com.mzvzm.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.net.URL;

/**
 * @Author lilongsha
 * @Description
 * @Date 2022/4/28 15:42
 */
@Entity(name = "contact")
public class Contact {
    @Id
    private Integer id;
    /**
     * 嵌入类型
     */
    private Name name;
    private String notes;
    private URL website;
    private boolean starred;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public URL getWebsite() {
        return website;
    }

    public void setWebsite(URL website) {
        this.website = website;
    }

    public boolean isStarred() {
        return starred;
    }

    public void setStarred(boolean starred) {
        this.starred = starred;
    }
}
