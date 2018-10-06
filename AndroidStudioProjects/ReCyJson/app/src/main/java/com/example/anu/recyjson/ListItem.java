package com.example.anu.recyjson;

public class ListItem {
    private String head;
    private String descrip;
    private String imageUrl;

    public ListItem(String head, String descrip, String imageUrl) {
        this.head = head;
        this.descrip = descrip;
        this.imageUrl = imageUrl;
    }

    public ListItem(String name, String realname) {
    }

    public String getHead() {
        return head;
    }

    public String getDescrip() {
        return descrip;
    }

    public String getImageUrl() {
        return imageUrl;
    }
}
