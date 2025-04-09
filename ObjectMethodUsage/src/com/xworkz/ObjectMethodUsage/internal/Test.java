package com.xworkz.ObjectMethodUsage.internal;

public class Test {
    private String mode;
    private int maxMarks;
    private String date;

    public Test(String mode, String date, int maxMarks){
        System.out.println("String, String, int-arg const of Test");
        this.mode = mode;
        this.date = date;
        this.maxMarks = maxMarks;
    }

    @Override
    public String toString() {
        return "Test{" +
                "mode='" + mode + '\'' +
                ", maxMarks=" + maxMarks +
                ", date='" + date + '\'' +
                '}';
    }
}
