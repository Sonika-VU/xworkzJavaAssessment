package com.xworkz.busy.runner;

import com.xworkz.busy.external.CompressionTool;
import com.xworkz.busy.internal.implementor.ZipFileCompressorImpl;
import com.xworkz.busy.internal.rules.FileCompressor;

public class FileCompressorRunner {
    public static void main(String[] args) {
        FileCompressor fileCompressor = new ZipFileCompressorImpl();
        CompressionTool compressionTool = new CompressionTool();

        compressionTool.merge();
    }
}
