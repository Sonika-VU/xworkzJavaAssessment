package com.xworkz.isARelation;

public class DSLRCamera extends Camera {
    public DSLRCamera() {
        super();
        System.out.println("no-arg const of DSLRCamera");
    }

    {
        super.capturePhoto();
        System.out.println("Running capturePhoto in DSLRCamera");
    }

    {
        super.recordVideo();
        System.out.println("Running recordVideo in DSLRCamera");
    }

    {
        super.zoomIn();
        System.out.println("Running zoomIn in DSLRCamera");
    }

    {
        super.zoomOut();
        System.out.println("Running zoomOut in DSLRCamera");
    }

    {
        super.adjustFocus();
        System.out.println("Running adjustFocus in DSLRCamera");
    }
}
