package com.xworkz.ObjectMethodUsage.internal;

public class Robot {
    private String model;
    private String function;
    private boolean isAutonomous;

    public Robot(String model, String function, boolean isAutonomous) {
        System.out.println("String, String, boolean-arg const of Robot");
        this.model = model;
        this.function = function;
        this.isAutonomous = isAutonomous;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "model='" + model + '\'' +
                ", function='" + function + '\'' +
                ", isAutonomous=" + isAutonomous +
                '}';
    }

    @Override
    public int hashCode() {
        return 4322;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Robot) {
                System.out.println("Ref instanceOf Robot");
                Robot robot1 = this;
                Robot  robot2 = (Robot) obj;
                if (robot1.isAutonomous == robot2.isAutonomous && robot1.function == robot2.function && robot1.model == robot2.model) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
