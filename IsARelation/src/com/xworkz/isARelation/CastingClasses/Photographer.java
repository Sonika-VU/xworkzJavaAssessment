package com.xworkz.isARelation.CastingClasses;

import com.xworkz.isARelation.Camera;
import com.xworkz.isARelation.DSLRCamera;

public class Photographer {
    public void takePicture(Camera camera){
        camera.zoomIn();
        camera.adjustFocus();
        camera.capturePhoto();
        camera.recordVideo();
        camera.zoomOut();

        if(camera instanceof DSLRCamera){
            DSLRCamera dslrCamera  = (DSLRCamera) camera;
            dslrCamera.editImage();
        }
    }
}
