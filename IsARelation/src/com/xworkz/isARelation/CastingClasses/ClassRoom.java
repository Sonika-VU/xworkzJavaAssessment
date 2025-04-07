package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.NoticeBoard;
import com.xworkz.isARelation.Poster;

public class ClassRoom {

    public void fixNPoster(Poster poster){
        poster.display();
        poster.print();
        poster.share();
        poster.stick();
        poster.write();

        if(poster instanceof NoticeBoard){
            NoticeBoard noticeBoard = (NoticeBoard) poster;
            noticeBoard.addMessage();
        }
    }
}
