package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.MathTeacher;
import com.xworkz.isARelation.Teacher;

public class TeacherRunner {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Teacher teacher1 = new MathTeacher();
        MathTeacher mathTeacher = new MathTeacher();

        System.out.println("=======================");
        teacher.assignHomework();
        teacher.attendMeeting();
        teacher.conductExam();
        teacher.gradePapers();
        teacher.teach();

        System.out.println("=======================");
        teacher1.assignHomework();
        teacher1.attendMeeting();
        teacher1.conductExam();
        teacher1.gradePapers();
        teacher1.teach();

        System.out.println("=======================");
        mathTeacher.assignHomework();
        mathTeacher.attendMeeting();
        mathTeacher.conductExam();
        mathTeacher.gradePapers();
        mathTeacher.teach();
    }
}
