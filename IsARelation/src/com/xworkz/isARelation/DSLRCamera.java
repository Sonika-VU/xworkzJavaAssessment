package com.xworkz.isARelation;

public class DSLRCamera extends Camera {
    public DSLRCamera() {
        super();
        System.out.println("no-arg const of DSLRCamera");
    }

    @Override
    public void capturePhoto(){
//        super.capturePhoto();
        System.out.println("Running capturePhoto in DSLRCamera");
    }

    @Override
    public void recordVideo(){
//        super.recordVideo();
        System.out.println("Running recordVideo in DSLRCamera");
    }

    @Override
    public void zoomIn(){
//        super.zoomIn();
        System.out.println("Running zoomIn in DSLRCamera");
    }

    @Override
    public void zoomOut(){
//        super.zoomOut();
        System.out.println("Running zoomOut in DSLRCamera");
    }

    @Override
    public void adjustFocus(){
//        super.adjustFocus();
        System.out.println("Running adjustFocus in DSLRCamera");
    }

    public void editImage(){
        System.out.println("Running editImage in DSLRCamera");
    }
}
