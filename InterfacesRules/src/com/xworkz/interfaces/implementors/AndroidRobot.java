package com.xworkz.interfaces.implementors;

import com.xworkz.interfaces.connectors.Robot;

public class AndroidRobot implements Robot {
    @Override
    public void walk() {
        System.out.println("Running walk in AndroidRobot");
    }

    @Override
    public void talk() {
        System.out.println("Running talk in AndroidRobot");
    }

    @Override
    public void recharge() {
        System.out.println("Running recharge in AndroidRobot");
    }
}
