package com.xworkz.ObjectMethodUsage.internal;

public class Student {
    private String name;
    private int rollNumber;
    private double percentage;

    public Student(String name, int rollNumber, double percentage) {
        System.out.println("String, int, double-arg const of Student");
        this.name = name;
        this.rollNumber = rollNumber;
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", percentage=" + percentage +
                '}';
    }

    @Override
    public int hashCode() {
        return 780;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Student) {
                System.out.println("Ref instanceOf Student");
                Student student1 = this;
                Student  student2 = (Student) obj;
                if (student2.name == student1.name && student2.percentage == student1.percentage && student2.rollNumber == student1.rollNumber) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
