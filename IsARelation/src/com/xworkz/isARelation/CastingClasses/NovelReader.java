package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Book;
import com.xworkz.isARelation.Novel;

public class NovelReader {

    public void read(Book book){
        book.giftIt();
        book.read();
        book.print();
        book.wrap();
        book.write();

        if(book instanceof Novel){
            Novel novel = (Novel) book;
            novel.makeStory();
        }
    }
}
