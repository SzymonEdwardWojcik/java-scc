package com.codecool.scc.services;

import com.codecool.scc.view.OutputFormat;
import com.codecool.scc.view.OutputFormatterFactory;

import java.io.File;
import java.io.FileReader;

public class SimpleCsvConverter {

    private FileReader fileReader;
    private OutputFormatterFactory outputFormatterFactory;

    public SimpleCsvConverter(FileReader fileReader, OutputFormatterFactory outputFormatterFactory) {
        this.fileReader = fileReader;
        this.outputFormatterFactory = outputFormatterFactory;
    }

    public void convert(File file, OutputFormat outputFormat) {
        System.out.println("I convert CSV to output format");
    }

    public void convert(File file) {
        System.out.println("I convert CSV to output format");
    }
}
