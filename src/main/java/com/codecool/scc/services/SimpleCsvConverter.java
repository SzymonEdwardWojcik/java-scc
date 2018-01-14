package com.codecool.scc.services;

import com.codecool.scc.view.OutputFormat;

import java.io.File;
import java.io.FileReader;

public class SimpleCsvConverter {

    private FileReader fr;

    public SimpleCsvConverter(FileReader fr) {
        this.fr = fr;
    }

    public void convert(File file, OutputFormat outputFormat) {
        System.out.println("I convert CSV to output format");
    }

    public void convert(File file) {
        System.out.println("I convert CSV to output format");
    }
}
