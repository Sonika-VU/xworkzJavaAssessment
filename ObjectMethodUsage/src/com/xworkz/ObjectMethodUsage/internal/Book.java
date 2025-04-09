package com.xworkz.ObjectMethodUsage.internal;

public class Book {
    private  String size;
    private String brand;
    private int price;

    public Book(String size, String brand, int price){
        System.out.println("String, String, int-arg const of ");
        this.size = size;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "size='" + size + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
