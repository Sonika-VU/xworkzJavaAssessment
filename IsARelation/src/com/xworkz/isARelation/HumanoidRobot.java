package com.xworkz.isARelation;

public class HumanoidRobot extends  Robot{

    public HumanoidRobot(){
        super();
        System.out.println("no-arg const of HumanoidRobot");
    }

    {
        super.lift();
        System.out.println("Running lift in HumanoidRobot");
    }

    {
        super.work();
        System.out.println("Running work in HumanoidRobot");
    }

    {
        super.displaceThings();
        System.out.println("Running displaceThings in HumanoidRobot");
    }

    {
        super.construct();
        System.out.println("Running construct in HumanoidRobot");
    }

    {
        super.assemble();
        System.out.println("Running assemble in HumanoidRobot");
    }

}
