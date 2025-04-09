package com.xworkz.ObjectMethodUsage.internal;

public class RemoteControl {
    private String deviceType;
    private int buttons;
    private boolean isRechargeable;

    public RemoteControl(String deviceType, int buttons, boolean isRechargeable) {
        System.out.println("String, int, boolean-arg const of RemoteControl");
        this.deviceType = deviceType;
        this.buttons = buttons;
        this.isRechargeable = isRechargeable;
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "deviceType='" + deviceType + '\'' +
                ", buttons=" + buttons +
                ", isRechargeable=" + isRechargeable +
                '}';
    }
}
