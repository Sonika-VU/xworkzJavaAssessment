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

    @Override
    public int hashCode() {
        return 3465;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("ref is not null");
            if (obj instanceof RemoteControl) {
                System.out.println("Ref instanceOf RemoteControl");
                RemoteControl remoteControl1 = this;
                RemoteControl  remoteControl2 = (RemoteControl) obj;
                if (remoteControl1.deviceType == remoteControl2.deviceType && remoteControl1.isRechargeable == remoteControl2.isRechargeable && remoteControl1.buttons == remoteControl2.buttons) {
                    System.out.println("Both are same");
                    return true;
                }
            }
        }
        return false;
    }
}
