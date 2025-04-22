package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.ImageProcessor;

public class PhotoEditor {

    ImageProcessor imageProcessor;

    public PhotoEditor(ImageProcessor imageProcessor){
        this.imageProcessor = imageProcessor;
        System.out.println("imageProcessor-arg const of PhotoEditor");
    }

    public void editImage(){
        System.out.println("Running editImage in PhotoEditor");
        if(this.imageProcessor != null){
            this.imageProcessor.applyFilter();
        }
    }
}
