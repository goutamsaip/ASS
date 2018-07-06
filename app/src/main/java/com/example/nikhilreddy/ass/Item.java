package com.example.nikhilreddy.ass;

public class Item {

    private String number;
    private String chapter;

    public Item(String number, String chapter){
        this.number = number;
        this.chapter = chapter;
    }

    public String getChapter() {
        return chapter;
    }

    public String getNumber() {
        return number;
    }
}
