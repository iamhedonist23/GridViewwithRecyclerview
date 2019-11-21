package com.example.demogridlistview;

import java.io.Serializable;

public class Gallary implements Serializable {

    String imagename;
    int image;

    public Gallary() {
    }

    public Gallary(String imagename, int image) {
        this.imagename = imagename;
        this.image = image;
    }

    public String getImagename() {
        return imagename;
    }

    public void setImagename(String imagename) {
        this.imagename = imagename;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
