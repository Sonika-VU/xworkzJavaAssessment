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
}
