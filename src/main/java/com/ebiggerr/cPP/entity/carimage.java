package com.ebiggerr.cPP.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="carimage")
public class carimage {

    @Id
    private long id;

    private String imagepath;

    public carimage(long id,String imagePath){
        this.id=id;
        this.imagepath=imagePath;
    }

    public carimage(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }
}
