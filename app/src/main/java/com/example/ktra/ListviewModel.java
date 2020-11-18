package com.example.ktra;

public class ListviewModel {
    int image;
    String tenSP, freeShip, tienSP, reViews ;
    float ratingBar;

    public ListviewModel(int image, String tenSP, String freeShip, String tienSP) {
        this.image = image;
        this.tenSP = tenSP;
        this.freeShip = freeShip;
        this.tienSP = tienSP;


    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getFreeShip() {
        return freeShip;
    }

    public void setFreeShip(String freeShip) {
        this.freeShip = freeShip;
    }

    public String getTienSP() {
        return tienSP;
    }

    public void setTienSP(String tienSP) {
        this.tienSP = tienSP;
    }


}
