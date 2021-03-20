package com.vote.demo.entity;

import com.sun.istack.Nullable;

import javax.persistence.*;

@Entity
@Table(name = "total")
public class Total {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int stuId;
    private int subId;
    @Nullable
    private int vote;
    @Nullable
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subid) {
        this.subId = subid;
    }

    public int getVote() {
        return vote;
    }

    public void setVote(int vote) {
        this.vote = vote;
    }
}
