package com.xworkz.busy.internal.implementor;

import com.xworkz.busy.internal.rules.FileCompressor;

public class ZipFileCompressorImpl implements FileCompressor {

    public ZipFileCompressorImpl(){
        System.out.println("no-arg const of ZipFileCompressorImpl");
    }
    @Override
    public void compress() {
        System.out.println("Running compress in ZipFileCompressorImpl");
    }
}
