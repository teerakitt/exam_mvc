package com.vote.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    private int id;
    private String subName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }
}
