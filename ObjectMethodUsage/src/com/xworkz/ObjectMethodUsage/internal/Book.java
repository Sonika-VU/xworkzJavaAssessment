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

    @Override
    public int hashCode() {
        return 67;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Book){
                System.out.println("Ref instanceOf Antique");
                Book book1 = this;
                Book book2 = (Book) obj;
                if(book1.brand == book2.brand ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
