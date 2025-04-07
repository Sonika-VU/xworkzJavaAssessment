package com.xworkz.isARelation;

public class Circle extends Shape {
    public Circle() {
        super();
        System.out.println("no-arg const of Circle");
    }

    @Override
    public void draw(){
//        super.draw();
        System.out.println("Running draw in Circle");
    }

    @Override
    public void calculateArea(){
//        super.calculateArea();
        System.out.println("Running calculateArea in Circle");
    }

    @Override
    public void calculatePerimeter(){
//        super.calculatePerimeter();
        System.out.println("Running calculatePerimeter in Circle");
    }

    @Override
    public void fillColor(){
//        super.fillColor();
        System.out.println("Running fillColor in Circle");
    }

    @Override
    public void resize(){
//        super.resize();
        System.out.println("Running resize in Circle");
    }

    public void rotate(){
        System.out.println("Running rotate in Circle");
    }
}
