package com.xworkz.ObjectMethodUsage.internal;

public class Award {
    private String awardName;
    private String category;
    private int yearWon;

    public Award(String awardName, String category, int yearWon) {
        System.out.println("String, String, int-arg const of Award");
        this.awardName = awardName;
        this.category = category;
        this.yearWon = yearWon;
    }

    @Override
    public String toString() {
        return "Award{" +
                "awardName='" + awardName + '\'' +
                ", category='" + category + '\'' +
                ", yearWon=" + yearWon +
                '}';
    }

    @Override
    public int hashCode() {
        return 22;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null){
            System.out.println("ref is not null");
            if(obj instanceof Award){
                System.out.println("Ref instanceOf Award");
                Award award1 = this;
                Award award2 = (Award) obj;
                if(award1.awardName == award2.awardName ){
                    System.out.println("Both are same");
                    return  true;
                }
            }
        }
        return false;
    }
}
