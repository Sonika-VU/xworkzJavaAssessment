package com.xworkz.ObjectMethodUsage.internal;

public class Signal {
    private String location;
    private int duration;
    private boolean isWorking;

    public Signal(String location, int duration, boolean isWorking) {
        System.out.println("String, int, boolean-arg const of Signal");
        this.location = location;
        this.duration = duration;
        this.isWorking = isWorking;
    }

    @Override
    public String toString() {
        return "Signal{" +
                "location='" + location + '\'' +
                ", duration=" + duration +
                ", isWorking=" + isWorking +
                '}';
    }

    @Override
    public int hashCode() {
        return 3;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof Signal) {
                System.out.println("Ref instanceOf Signal");
                Signal signal1 = this;
                Signal  signal2 = (Signal) obj;
                if (signal2.isWorking == signal1.isWorking && signal2.duration == signal2.duration && signal2.isWorking == signal2.isWorking) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
