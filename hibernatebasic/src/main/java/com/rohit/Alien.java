package com.rohit;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
    @Id
    private  int aid;
    private String aname;
    private String atech;

    public String getAtech() {
        return atech;
    }

    public void setAtech(String atech) {
        this.atech = atech;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", atech='" + atech + '\'' +
                '}';
    }
}
