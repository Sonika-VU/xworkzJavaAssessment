package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.HumanoidRobot;
import com.xworkz.isARelation.Robot;

public class RobotRunner {
    public static void main(String[] args) {
        Robot robot = new Robot();
        Robot robot1 = new HumanoidRobot();
        HumanoidRobot humanoidRobot = new HumanoidRobot();

        System.out.println("===================================");
        robot.assemble();
        robot.displaceThings();
        robot.construct();
        robot.lift();
        robot.work();

        System.out.println("===================================");
        robot1.assemble();
        robot1.displaceThings();
        robot1.construct();
        robot1.lift();
        robot1.work();

        System.out.println("===================================");
        humanoidRobot.assemble();
        humanoidRobot.displaceThings();
        humanoidRobot.construct();
        humanoidRobot.lift();
        humanoidRobot.work();
       
    }
}
