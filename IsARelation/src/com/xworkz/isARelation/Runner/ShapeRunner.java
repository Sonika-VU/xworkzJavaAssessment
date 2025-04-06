package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Circle;
import com.xworkz.isARelation.Shape;

public class ShapeRunner {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape shape1 = new Circle();
        Circle circle = new Circle();

        System.out.println("=======================");
        shape.calculateArea();
        shape.draw();
        shape.calculatePerimeter();
        shape.fillColor();
        shape.resize();

        System.out.println("=======================");
        shape1.calculateArea();
        shape1.draw();
        shape1.calculatePerimeter();
        shape1.fillColor();
        shape1.resize();

        System.out.println("=======================");
        circle.calculateArea();
        circle.draw();
        circle.calculatePerimeter();
        circle.fillColor();
        circle.resize();
    }
}
