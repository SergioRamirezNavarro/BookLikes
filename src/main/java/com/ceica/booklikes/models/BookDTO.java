package com.ceica.booklikes.models;

import java.util.Date;

public class BookDTO {
    private  int idbook;
    private String title;
    private String description;
    private  String author;
    private Date createtime;
    private int iduser;

    public BookDTO() {
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public int getIdbook() {
        return idbook;
    }

    public void setIdbook(int idbook) {
        this.idbook = idbook;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}