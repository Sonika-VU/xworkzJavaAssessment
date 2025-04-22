package com.xworkz.busy.runner;

import com.xworkz.busy.external.PhotoEditor;
import com.xworkz.busy.internal.implementor.BlurFilter;
import com.xworkz.busy.internal.rules.ImageProcessor;

public class ImageProcessorRunner {
    public static void main(String[] args) {
        ImageProcessor imageProcessor = new BlurFilter();
        PhotoEditor photoEditor = new PhotoEditor(imageProcessor);

        photoEditor.editImage();
    }
}
