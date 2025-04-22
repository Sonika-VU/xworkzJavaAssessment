package com.xworkz.busy.external;

import com.xworkz.busy.internal.rules.FileCompressor;

public class CompressionTool {
    FileCompressor fileCompressor ;
    public CompressionTool(FileCompressor fileCompressor){
        this.fileCompressor = fileCompressor;
        System.out.println("fileCompressor-arg const of CompressionTool");
    }

    public void merge(){
        System.out.println("Running merge in CompressionTool");
        if(this.fileCompressor != null){
            this.fileCompressor.compress();
        }
    }
}
