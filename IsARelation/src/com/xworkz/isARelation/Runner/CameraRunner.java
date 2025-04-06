package com.xworkz.isARelation.Runner;

import com.xworkz.isARelation.Camera;
import com.xworkz.isARelation.DSLRCamera;

public class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Camera camera1 = new DSLRCamera();
        DSLRCamera dslrCamera = new DSLRCamera();

        System.out.println("==========================");
        camera.zoomIn();
        camera.adjustFocus();
        camera.capturePhoto();
        camera.recordVideo();
        camera.zoomOut();

        System.out.println("==========================");
        camera1.zoomIn();
        camera1.adjustFocus();
        camera1.capturePhoto();
        camera1.recordVideo();
        camera1.zoomOut();

        System.out.println("==========================");
        dslrCamera.zoomIn();
        dslrCamera.adjustFocus();
        dslrCamera.capturePhoto();
        dslrCamera.recordVideo();
        dslrCamera.zoomOut();

    }
}
