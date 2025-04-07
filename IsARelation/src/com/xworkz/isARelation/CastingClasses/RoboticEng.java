package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.HumanoidRobot;
import com.xworkz.isARelation.Robot;

public class RoboticEng {

    public void build(Robot robot){
        robot.assemble();
        robot.displaceThings();
        robot.construct();
        robot.lift();
        robot.work();

        if(robot instanceof HumanoidRobot){
            HumanoidRobot humanoidRobot = new HumanoidRobot();
            humanoidRobot.help();
        }
    }
}
