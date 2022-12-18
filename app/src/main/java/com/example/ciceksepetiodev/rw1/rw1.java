package com.example.ciceksepetiodev.rw1;

import java.io.Serializable;

public class rw1 implements Serializable {
    private int id;
    private String resimAd;
    private String ad;
    private String aciklama;

    public rw1(int id, String resimAd, String ad, String aciklama) {
        this.id = id;
        this.resimAd = resimAd;
        this.ad = ad;
        this.aciklama = aciklama;
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

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.ad = aciklama;
    }

    public String get() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
