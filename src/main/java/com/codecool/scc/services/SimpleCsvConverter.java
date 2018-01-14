package com.codecool.scc.services;

import com.codecool.scc.view.OutputFormat;

import java.io.File;

public class SimpleCsvConverter {

    public void convert(File file, OutputFormat outputFormat) {
        System.out.println("I convert CSV to output format");
    }

    public void convert(File file) {
        System.out.println("I convert CSV to output format");
    }
}
