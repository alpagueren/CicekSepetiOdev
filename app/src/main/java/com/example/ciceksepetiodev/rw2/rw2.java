package com.example.ciceksepetiodev.rw2;

import java.io.Serializable;

public class rw2 implements Serializable {
    private int id;
    private String resimAd;
    private String ad;

    public rw2(int id, String resimAd, String ad) {
        this.id = id;
        this.resimAd = resimAd;
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResimAd() {
        return resimAd;
    }

    public void setResimAd(String resimAd) {
        this.resimAd = resimAd;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}