package com.xworkz.isARelation;

public class Circle extends Shape {
    public Circle() {
        super();
        System.out.println("no-arg const of Circle");
    }

    {
        super.draw();
        System.out.println("Running draw in Circle");
    }

    {
        super.calculateArea();
        System.out.println("Running calculateArea in Circle");
    }

    {
        super.calculatePerimeter();
        System.out.println("Running calculatePerimeter in Circle");
    }

    {
        super.fillColor();
        System.out.println("Running fillColor in Circle");
    }

    {
        super.resize();
        System.out.println("Running resize in Circle");
    }
}
