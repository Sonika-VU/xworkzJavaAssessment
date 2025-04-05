package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Book;
import com.xworkz.isARelation.Novel;

public class BookRunner {
    public static void main(String[] args) {
        Book book = new Book();
        Book book1= new Novel();
        Novel novel= new Novel();

        System.out.println("==========================");
        book.giftIt();
        book.read();
        book.print();
        book.wrap();
        book.write();

        System.out.println("==========================");
        book1.giftIt();
        book1.read();
        book1.print();
        book1.wrap();
        book1.write();

        System.out.println("==========================");
        novel.giftIt();
        novel.read();
        novel.print();
        novel.wrap();
        novel.write();

    }
}
