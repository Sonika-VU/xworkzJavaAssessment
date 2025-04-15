package com.xworkz.abstractKeyword.internal;

import com.xworkz.abstractKeyword.external.Shape;

public class Rectangle extends Shape {

    @Override
    public void draw() {
        System.out.println("Running draw in Rectangle");
    }
}
