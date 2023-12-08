package com.celestin.sample01.BookAPI;

public class Book {
    private int id;
    private String name;
    private String author;
    private String type;
    private double price;
    private int stock;
    private boolean availability;

    public Book(int id, String name, String author, String type, double price, int stock, boolean availability) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.type = type;
        this.price = price;
        this.stock = stock;
        this.availability = availability;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", availability=" + availability +
                '}';
    }
}
