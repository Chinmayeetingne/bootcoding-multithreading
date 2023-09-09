package com.bootcoding.java.multithreading.store.book;

public class book {int id;
    String title;
    String author;
    double price;

    public void Book(int id, String title, String author, double price){
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void print(){
        System.out.println("Book -> Title:"+ title + ", Author: "+ author + ", Price:" + price);
    }

}
