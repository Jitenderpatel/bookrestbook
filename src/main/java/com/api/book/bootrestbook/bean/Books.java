package com.api.book.bootrestbook.bean;

public class Books {
    private int  id;
    private String name;
    private String price;
    private String  author;
    
    @Override
    public String toString() {
        return "Books [id=" + id + ", name=" + name + ", price=" + price + ", author=" + author + "]";
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }
    public String getAuthor() {
        return author;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public Books(int id, String name, String price, String author) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.author = author;
    }
    
    public Books() {}
    
}
