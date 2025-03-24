package com.xworkz.AccessSpecifier.internal;

import com.xworkz.AccessSpecifier.external.BoardStudent;

public class BoardRunner {
    public static void main(String[] args) {
        BoardTeacher boardTeacher = new BoardTeacher();
        BoardStudent boardStudent = new BoardStudent();

        boardTeacher.teach();
        boardStudent.listen();
    }
}
