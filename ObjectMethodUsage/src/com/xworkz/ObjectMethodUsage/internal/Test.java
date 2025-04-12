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

    @Override
    public int hashCode() {
        return 9807;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Test) {
                System.out.println("Ref instanceOf Test");
                Test test1 = this;
                Test  test2 = (Test) obj;
                if (test2.maxMarks == test1.maxMarks && test2.date == test1.date && test2.mode == test1.mode) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
