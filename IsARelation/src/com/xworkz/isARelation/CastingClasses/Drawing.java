package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Circle;
import com.xworkz.isARelation.Shape;

public class Drawing {

    public void draw(Shape shape){
        shape.calculateArea();
        shape.draw();
        shape.calculatePerimeter();
        shape.fillColor();
        shape.resize();

        if(shape instanceof Circle){
            Circle circle = (Circle) shape;
            circle.rotate();
        }
    }
}
