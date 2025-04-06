package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Hammer;
import com.xworkz.isARelation.Tool;

public class ToolRunner {
    public static void main(String[] args) {
        Tool tool = new Tool();
        Tool tool1 = new Hammer();
        Hammer hammer = new Hammer();

        System.out.println("=========================");
        tool.turnOff();
        tool.beat();
        tool.hold();
        tool.use();
        tool.turnOn();

        System.out.println("=========================");
        tool1.turnOff();
        tool1.beat();
        tool1.hold();
        tool1.use();
        tool1.turnOn();

        System.out.println("=========================");
        hammer.turnOff();
        hammer.beat();
        hammer.hold();
        hammer.use();
        hammer.turnOn();
    }
}
