package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.ImageProcessor;

public class BlurFilter implements ImageProcessor {
    public BlurFilter(){
        System.out.println("no-arg const of BlurFilter");
    }

    @Override
    public void applyFilter() {
        System.out.println("Running applyFilter in BlurFilter");
    }
}
