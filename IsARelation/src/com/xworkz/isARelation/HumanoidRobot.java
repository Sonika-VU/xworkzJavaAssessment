package com.xworkz.isARelation;

public class HumanoidRobot extends  Robot{

    public HumanoidRobot(){
        super();
        System.out.println("no-arg const of HumanoidRobot");
    }

    @Override
    public void lift(){
//        super.lift();
        System.out.println("Running lift in HumanoidRobot");
    }

    @Override
    public void work(){
//        super.work();
        System.out.println("Running work in HumanoidRobot");
    }

    @Override
    public void displaceThings(){
//        super.displaceThings();
        System.out.println("Running displaceThings in HumanoidRobot");
    }

    @Override
    public void construct(){
//        super.construct();
        System.out.println("Running construct in HumanoidRobot");
    }

    public void assemble(){
//        super.assemble();
        System.out.println("Running assemble in HumanoidRobot");
    }

}
